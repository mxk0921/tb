package tb;

import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface fdb extends Closeable {
    public static final int CACHE_KEY_NO_ENCRYPTION = 268435456;
    public static final int ENCRYPTED = 1;
    public static final int NAME_MD5 = 8;
    public static final int PERSIST = 4;
    public static final int VERIFY = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void onAllObjectRemoveCallback(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d<T> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e<T> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        void onObjectRemoveCallback(String str, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface h {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface i {
        void onObjectSetCallback(String str, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface j {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface k {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface m {
    }

    boolean A0(String str);

    void D(String str, g gVar);

    void E(a aVar);

    boolean G0(String str, String str2, Object obj, int i2);

    InputStream H(String str);

    <T> T I0(String str, String str2);

    boolean J0(String str, String str2);

    List<String> K(String str);

    boolean N(String str, Object obj);

    <T> T O(String str, Class<T> cls);

    boolean T(String str, String str2, InputStream inputStream);

    long U(String str);

    boolean V(String str);

    boolean W(String str, String str2, InputStream inputStream, int i2);

    <T> T d0(String str);

    long e0(String str, String str2);

    <T> T g0(String str, String str2, Class<T> cls);

    boolean j(String str, InputStream inputStream);

    InputStream j0(String str, String str2);

    Set<String> keySet();

    void m0(String str, Object obj, i iVar);

    boolean s();

    void v0();

    boolean y(String str, String str2);
}
