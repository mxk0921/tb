package anet.channel.detect;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRTTDetector {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface TYPE {
        public static final int CONNECT = 1;
        public static final int PING = 3;
        public static final int REQUEST = 2;
    }

    long getRTT(String str);

    void recordRTT(String str, int i, long j);
}
