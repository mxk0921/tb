package com.taobao.tao.homepage.revision;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.prefork.ViewFactory;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import tb.b3b;
import tb.c4b;
import tb.czj;
import tb.h2b;
import tb.kmn;
import tb.r5a;
import tb.sfh;
import tb.t2b;
import tb.t2o;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ChangeContainerProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CUSTOM_1 = "ACTION_CUSTOM_1";
    public static final String ACTION_CUSTOM_2 = "ACTION_CUSTOM_2";
    public static final String ACTION_CUSTOM_3 = "ACTION_CUSTOM_3";
    public static final String ACTION_CUSTOM_4 = "ACTION_CUSTOM_4";
    public static final String ACTION_CUSTOM_5 = "ACTION_CUSTOM_5";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ChangeContainerType {
        revision,
        edition,
        overseaHotRevision;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ChangeContainerType changeContainerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/revision/ChangeContainerProcess$ChangeContainerType");
        }

        public static ChangeContainerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChangeContainerType) ipChange.ipc$dispatch("79576572", new Object[]{str});
            }
            return (ChangeContainerType) Enum.valueOf(ChangeContainerType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ChangeContainerProcess f12425a = new ChangeContainerProcess();

        static {
            t2o.a(729809351);
        }

        public static /* synthetic */ ChangeContainerProcess a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChangeContainerProcess) ipChange.ipc$dispatch("4f56c058", new Object[0]);
            }
            return f12425a;
        }
    }

    static {
        t2o.a(729809348);
    }

    public static ChangeContainerProcess d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeContainerProcess) ipChange.ipc$dispatch("d5400b2", new Object[0]);
        }
        return b.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be06b4d6", new Object[]{this});
        }
    }

    public final void b(ChangeContainerType changeContainerType) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996c69d9", new Object[]{this, changeContainerType});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject.put("oldMultiTab", (Object) bool);
        jSONObject.put("oldNewFace", (Object) bool);
        Boolean bool2 = Boolean.TRUE;
        jSONObject.put("newMultiTab", (Object) bool2);
        jSONObject.put("newNewFace", (Object) bool2);
        if (changeContainerType == null) {
            obj = "";
        } else {
            obj = changeContainerType.toString();
        }
        r5a.j("Page_Home", 19999, "homeRevision", obj, "", jSONObject);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6521f0", new Object[]{this});
            return;
        }
        h2b.a().e();
        czj.a();
    }

    public void e(ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8858c488", new Object[]{this, changeContainerType});
            return;
        }
        sfh.c("ChangeContainerProcess", "homeRevision");
        if (!f()) {
            sfh.d("ChangeContainerProcess", "homeRevision error !isEnableRevision");
            return;
        }
        g(changeContainerType);
        j();
        i();
        h(changeContainerType);
        t2b.b().b(b3b.c(), changeContainerType);
        try {
            ViewFactory.f().d();
        } catch (Throwable unused) {
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f0b6d3", new Object[]{this})).booleanValue();
        }
        z6d c = h2b.a().c();
        if (c == null || c.getRootView() == null || c.q1() == null || c.i0() == null) {
            return false;
        }
        return true;
    }

    public final void g(ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553df90e", new Object[]{this, changeContainerType});
        } else {
            b(changeContainerType);
        }
    }

    public final void h(ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20e3ae0", new Object[]{this, changeContainerType});
            return;
        }
        z6d c = h2b.a().c();
        if (c != null && c.q1() != null) {
            sfh.c("ChangeContainerProcess", "resetState");
            kmn.t();
            IBGContainerService iBGContainerService = (IBGContainerService) c4b.i().h(IBGContainerService.class);
            if (iBGContainerService != null) {
                iBGContainerService.reset();
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2482999b", new Object[]{this});
        } else if (!b3b.c().equals(h2b.a().b())) {
            sfh.c("ChangeContainerProcess", "updateNewFace 111");
            c();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a290c93", new Object[]{this});
            return;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            iHomeControllerService.initOverseaTabController();
        }
    }

    public ChangeContainerProcess() {
    }
}
