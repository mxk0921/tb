package com.taobao.trtc.call;

import android.content.Intent;
import com.taobao.trtc.api.TrtcDefines;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITrtcCallEngine {
    public static final int ERROR_CODE_INITIALIZE_ERROR = -101;
    public static final int ERROR_CODE_JOIN_CHANNEL_ERROR = -102;
    public static final int ERROR_CODE_MAKECALL_ERROR_TIMEOUT = -103;
    public static final int ERROR_CODE_MAKECALL_ERROR_UNKOWN = -104;
    public static final int ERROR_CODE_UNKOWN = -100;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface CallErrorCode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13902a;
        public String b;
        public int c;
        public boolean d;
        public String e;

        static {
            t2o.a(395313471);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(String str, TrtcDefines.f fVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f13903a;
        public String b;
        public int c;
        public boolean d = false;
        public boolean e = false;
        public int f = 2;
        public int g = 20000;
        public String h;

        static {
            t2o.a(395313474);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f13904a;
        public String b;
        public b c;
        public String d;
        public int e = 0;

        static {
            t2o.a(395313475);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f13905a;
        public int b;
        public int c;
        public Intent d;

        static {
            t2o.a(395313476);
        }
    }

    void a(String str, int i);

    boolean b(boolean z, String str);

    boolean muteLocal(boolean z);
}
