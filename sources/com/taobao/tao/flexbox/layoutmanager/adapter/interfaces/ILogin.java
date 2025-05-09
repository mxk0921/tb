package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ILogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface LoginCallback {
        public static final int LOGIN_CANCEL = 3;
        public static final int LOGIN_FAILED = 2;
        public static final int LOGIN_SUCCESS = 1;
        public static final int LOGOUT = 4;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public @interface LoginStatus {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12001a;
        public String b;
        public String c;

        static {
            t2o.a(503316593);
        }

        public static boolean a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("114bb80a", new Object[]{aVar, aVar2})).booleanValue();
            }
            if (aVar == aVar2) {
                return true;
            }
            if (aVar == null || aVar2 == null) {
                return false;
            }
            return aVar.equals(aVar2);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj instanceof a) {
                return TextUtils.equals(this.f12001a, ((a) obj).f12001a);
            }
            return false;
        }
    }

    static {
        t2o.a(503316590);
    }

    public abstract a a();

    public abstract boolean b();

    public abstract void c(LoginCallback loginCallback);

    public abstract void d(LoginCallback loginCallback);
}
