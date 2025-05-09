package com.taobao.tab2interact.core.component.revisitedu;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.revisitedu.data.RevisitEduDialogModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.a07;
import tb.avy;
import tb.cbu;
import tb.ckf;
import tb.cvy;
import tb.ggs;
import tb.jmi;
import tb.jpu;
import tb.r7;
import tb.t2o;
import tb.v3i;
import tb.vaj;
import tb.vgh;
import tb.vv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RevisitEduDialog extends r7 implements avy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public RevisitEduDialogModel S;
    public final List<b> T = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963089);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void b();

        void c();
    }

    static {
        t2o.a(689963088);
        t2o.a(689963094);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevisitEduDialog(Context context, FrameLayout frameLayout, jmi jmiVar, vv1 vv1Var) {
        super(context, frameLayout, jmiVar, vv1Var);
        ckf.g(context, "context");
        ckf.g(frameLayout, "interactHostView");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
    }

    public static final /* synthetic */ List d(RevisitEduDialog revisitEduDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("93fc7193", new Object[]{revisitEduDialog});
        }
        return revisitEduDialog.T;
    }

    public static /* synthetic */ Object ipc$super(RevisitEduDialog revisitEduDialog, String str, Object... objArr) {
        if (str.hashCode() == -1494410735) {
            super.z((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/revisitedu/RevisitEduDialog");
    }

    @Override // tb.r7
    public boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.avy.b
    public void a(RevisitEduDialogModel revisitEduDialogModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff39bb1d", new Object[]{this, revisitEduDialogModel, new Long(j)});
            return;
        }
        ckf.g(revisitEduDialogModel, "revisitEduDialogModel");
        vgh.c(this, "RevisitEduDialog", "数据请求成功回调，costTime=" + j);
        this.S = revisitEduDialogModel;
    }

    public final void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f21c7b", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "revisitEduDialogEventListener");
        ((ArrayList) this.T).add(bVar);
    }

    public final void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a84dd1", new Object[]{this, new Long(j)});
            return;
        }
        Map f = v3i.f(jpu.a("costTime", String.valueOf(j)));
        vgh.c(this, "RevisitEduDialog", "回访教育弹窗请求数据失败埋点，properties=" + f);
        cbu.c("Page_VideoCash_RevisitEduDialogRequestDataFail", f);
    }

    @Override // tb.avy.b
    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f22526", new Object[]{this, new Long(j)});
            return;
        }
        vgh.c(this, "RevisitEduDialog", "数据请求失败回调，costTime=" + j);
        g(j);
        this.S = null;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public View u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public FrameLayout.LayoutParams v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("9b39d05b", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        }
    }

    @Override // tb.wx1
    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed1a11", new Object[]{this, map});
            return;
        }
        ckf.g(map, "pageURLQuery");
        super.z(map);
        new avy(this).g(map.get("extParams"));
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        }
    }

    @Override // tb.r7
    public boolean F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f00afc8", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return true;
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("290b1c3", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        RevisitEduDialogModel revisitEduDialogModel = this.S;
        if (revisitEduDialogModel == null) {
            vgh.c(this, "RevisitEduDialog", "展示回访教育弹窗Pop，revisitEduDialogModel为空");
            return false;
        }
        List<String> showRevisitEduDialogPopTabIdList = revisitEduDialogModel.getShowRevisitEduDialogPopTabIdList();
        if (showRevisitEduDialogPopTabIdList == null || !showRevisitEduDialogPopTabIdList.contains(str)) {
            vgh.c(this, "RevisitEduDialog", "展示回访教育弹窗Pop，tabId不满足条件");
            return false;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        Object a2 = ggs.a("last_show_revisit_edu_dialog_pop_date");
        vgh.c(this, "RevisitEduDialog", "展示回访教育弹窗Pop，today=" + format + "，lastShowPopDate=" + a2);
        if (ckf.b(format, a2)) {
            return false;
        }
        new cvy(s0()).show(revisitEduDialogModel, new RevisitEduDialog$showRevisitEduDialogPop$1(this));
        Iterator it = ((ArrayList) this.T).iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        ggs.e("last_show_revisit_edu_dialog_pop_date", format);
        return true;
    }
}
