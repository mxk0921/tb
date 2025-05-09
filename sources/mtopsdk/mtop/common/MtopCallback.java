package mtopsdk.mtop.common;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopCallback {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface MtopCacheListener extends MtopListener {
        void onCached(MtopCacheEvent mtopCacheEvent, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface MtopFinishListener extends MtopListener {
        void onFinished(MtopFinishEvent mtopFinishEvent, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface MtopHeaderListener extends MtopListener {
        void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj);
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface MtopProgressListener extends MtopListener {
        @Deprecated
        void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface MtopStreamListener extends MtopListener {
        void onFinish(MtopFinishEvent mtopFinishEvent, Object obj);

        void onReceiveData(MtopFinishEvent mtopFinishEvent, Object obj);
    }

    static {
        t2o.a(589299879);
    }
}
