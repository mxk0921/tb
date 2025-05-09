package anetwork.channel;

import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkCallBack {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface FinishListener extends NetworkListener {
        void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface InputStreamListener extends NetworkListener {
        void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ProgressListener extends NetworkListener {
        void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ResponseCodeListener extends NetworkListener {
        boolean onResponseCode(int i, Map<String, List<String>> map, Object obj);
    }

    static {
        t2o.a(607125965);
    }
}
