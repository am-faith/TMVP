package com.path2wind.tmvp.rx;



/**
 * @author Terry
 * @time 16/9/13 20:59
 * email path2wind@gmail.com
 */
public class RxBus {

    private volatile static RxBus defaultInstance = null;

    private final Subject bus;

    public RxBus() {
        bus = new SerializedSubject<>(PublishSubject.create());
    }

    public static RxBus getDefault() {
        RxBus inInstance = defaultInstance;
        if (defaultInstance == null) {
            synchronized (RxBus.class) {
                inInstance = defaultInstance;
                if (inInstance == null) {
                    inInstance = new RxBus();
                    defaultInstance = inInstance;
                }
            }
        }
        return inInstance;
    }


    public void post (Object o) {
        bus.onNext(o);
    }


    public <T extends Object> Observable<T> toObserverable (final Class<T> eventType) {
        return bus.filter (new Func1<Object, Boolean>() {
            @Override
            public Boolean call (Object o) {
                return eventType.isInstance (o);
            }
        }).cast(eventType);
    }

}
