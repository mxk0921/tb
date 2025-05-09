package com.alibaba.security.realidentity;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.login4android.qrcode.result.Result;
import tb.bzn;
import tb.l6h;
import tb.u5h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2890a = "w2";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o2 f2891a;

        public a(o2 o2Var) {
            this.f2891a = o2Var;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            String str;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
            } else if (l6hVar == null) {
                this.f2891a.remoteAssetsResult(false, e2.B0, "Null callback or result found");
            } else {
                if (l6hVar.i()) {
                    try {
                        w2.this.c();
                    } catch (Throwable unused) {
                        this.f2891a.remoteAssetsResult(false, e2.B0, "so load error");
                        return;
                    }
                }
                RSoException c = l6hVar.c();
                o2 o2Var = this.f2891a;
                boolean i2 = l6hVar.i();
                if (c != null) {
                    i = c.getErrorCode();
                }
                if (c == null) {
                    str = Result.MSG_SUCCESS;
                } else {
                    str = c.getErrorMsg();
                }
                o2Var.remoteAssetsResult(i2, i, str);
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            IpChange ipChange2 = bzn.$ipChange;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return !TextUtils.isEmpty(bzn.b().d("ALBiometricsJni").d());
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return bzn.d().load("ALBiometricsJni").i();
    }

    public void a(o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a315014f", new Object[]{this, o2Var});
        } else if (b() && o2Var != null) {
            bzn.d().a("ALBiometricsJni", new a(o2Var));
        }
    }
}
