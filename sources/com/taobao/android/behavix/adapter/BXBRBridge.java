package com.taobao.android.behavix.adapter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.zm1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BXBRBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f6450a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ExtAction {
        UPLOAD_UPP_PLAN,
        UPLOAD_UPP_CONFIG,
        UPDATE_SCENE_ARGS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ExtAction extAction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/adapter/BXBRBridge$ExtAction");
        }

        public static ExtAction valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExtAction) ipChange.ipc$dispatch("83acb88f", new Object[]{str});
            }
            return (ExtAction) Enum.valueOf(ExtAction.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(404750473);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ab6243", new Object[]{aVar});
        } else {
            f6450a = aVar;
        }
    }

    public static void b(ExtAction extAction, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81be765d", new Object[]{extAction, objArr});
            return;
        }
        a aVar = f6450a;
        if (aVar != null) {
            ((zm1) aVar).b(extAction, objArr);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b27d1b", new Object[0]);
            return;
        }
        a aVar = f6450a;
        if (aVar != null) {
            ((zm1) aVar).e();
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862b6816", new Object[0]);
            return;
        }
        a aVar = f6450a;
        if (aVar != null) {
            ((zm1) aVar).c();
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9282ddb", new Object[0]);
            return;
        }
        a aVar = f6450a;
        if (aVar != null) {
            ((zm1) aVar).d();
        }
    }
}
