package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.containerframe.frames.AlbumDetailViewGroup;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.container.SlidingLayout;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.o6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uj0 extends v4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            uj0.m(uj0.this, "willHide");
            if (uj0.n(uj0.this) != null && uj0.n(uj0.this).getVisibility() == 0) {
                uj0.this.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/containerframe/frames/AlbumDetailFrame$2");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                uj0.p(uj0.this);
            }
        }

        @Override // tb.o6d.a, tb.o6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                uj0.o(uj0.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                uj0.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    static {
        t2o.a(468713481);
    }

    public uj0(FluidContext fluidContext) {
        super(fluidContext);
    }

    public static /* synthetic */ Object ipc$super(uj0 uj0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.a();
            return null;
        } else if (hashCode == -340027132) {
            super.d();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/containerframe/frames/AlbumDetailFrame");
        }
    }

    public static /* synthetic */ void m(uj0 uj0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8984a6", new Object[]{uj0Var, str});
        } else {
            uj0Var.w(str);
        }
    }

    public static /* synthetic */ View n(uj0 uj0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a0fd2adf", new Object[]{uj0Var});
        }
        uj0Var.getClass();
        return null;
    }

    public static /* synthetic */ void o(uj0 uj0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adf45de", new Object[]{uj0Var});
        } else {
            uj0Var.u();
        }
    }

    public static /* synthetic */ void p(uj0 uj0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b589bdf", new Object[]{uj0Var});
        } else {
            uj0Var.v();
        }
    }

    @Override // tb.xu1
    public void a() {
        enc lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        if (b()) {
            w("hide");
        }
        super.a();
        q();
        if (i()) {
            ((IBackEventService) this.f31608a.getService(IBackEventService.class)).getBackKeyEventDetector().c(this);
        }
        Context context = this.b;
        if (context instanceof Activity) {
            SlidingLayout.disableScroll((Activity) context, false);
        }
        if (pto.o(this.f31608a) && (lockListListener = ((ISceneConfigService) this.f31608a.getService(ISceneConfigService.class)).getLockListListener()) != null) {
            lockListListener.a(false);
        }
    }

    @Override // tb.v4w
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bac8720d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.v4w
    public void j(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c726b4", new Object[]{this, dVar});
        } else if (dVar != null) {
            a.d dVar2 = this.d;
            if (dVar2 == null || !TextUtils.equals(dVar2.c, dVar.c)) {
                hmi messageCenter = ((IMessageService) this.f31608a.getService(IMessageService.class)).getMessageCenter();
                s(messageCenter);
                messageCenter.f(new vrp(vrp.MSG_UPDATE_ALBUM_DETAIL, dVar.c, dVar.h(this.f31608a)));
                this.d = dVar;
            }
        }
    }

    @Override // tb.v4w, tb.bib
    public void onLoseFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4485122b", new Object[]{this});
        } else if (b()) {
            a();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436d973b", new Object[]{this});
        } else if (this.g) {
            b();
        }
    }

    public final void s(hmi hmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f59ef0c", new Object[]{this, hmiVar});
        }
    }

    public void t(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.fluid_sdk_album_detail);
            View inflate = viewStub.inflate();
            this.c = inflate;
            if (inflate instanceof AlbumDetailViewGroup) {
                ((AlbumDetailViewGroup) inflate).setPullRightCallback(new a());
            }
            ((ILifecycleService) this.f31608a.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new b());
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        this.g = true;
        q();
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            return;
        }
        this.g = false;
        q();
    }

    public final void w(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511c2507", new Object[]{this, str});
            return;
        }
        IMessageService iMessageService = (IMessageService) this.f31608a.getService(IMessageService.class);
        if (iMessageService != null) {
            a.d dVar = this.d;
            if (dVar != null) {
                str2 = dVar.c;
            } else {
                str2 = "-1";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("type", "slideRight");
            iMessageService.sendMessage(new vrp("VSMSG_albumDetailStateChanged", str2, hashMap));
        }
    }

    public final void x(AlbumData albumData, hmi hmiVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b237a85", new Object[]{this, albumData, hmiVar, dVar});
            return;
        }
        String str = albumData.albumPosition;
        Map h = dVar.h(this.f31608a);
        h.put(LogContext.NEED_MOVE, albumData.needMove);
        h.put("albumPosition", str);
        hmiVar.f(new vrp(vrp.MSG_UPDATE_ALBUM_DETAIL, dVar.c, h));
        y();
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1103ce", new Object[]{this});
        } else if (this.c != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new c());
            ofFloat.start();
        }
    }

    @Override // tb.xu1
    public void d() {
        enc lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        if (!b()) {
            w("show");
        }
        super.d();
        q();
        if (i()) {
            ((IBackEventService) this.f31608a.getService(IBackEventService.class)).getBackKeyEventDetector().d(this);
        }
        Context context = this.b;
        if (context instanceof Activity) {
            SlidingLayout.disableScroll((Activity) context, true);
        }
        if (pto.o(this.f31608a) && (lockListListener = ((ISceneConfigService) this.f31608a.getService(ISceneConfigService.class)).getLockListListener()) != null) {
            lockListListener.a(true);
        }
    }

    @Override // tb.v4w, tb.bib
    public boolean onHandleBackKeyEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
        }
        if (b()) {
            w("willHide");
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r5.equals("show") == false) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(com.taobao.android.fluid.framework.data.datamodel.AlbumData r9, com.taobao.android.fluid.framework.data.datamodel.a.d r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.uj0.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "c1086712"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r9
            r3[r0] = r10
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            com.taobao.android.fluid.core.FluidContext r4 = r8.f31608a
            java.lang.Class<com.taobao.android.fluid.framework.deprecated.message.IMessageService> r5 = com.taobao.android.fluid.framework.deprecated.message.IMessageService.class
            com.taobao.android.fluid.core.FluidService r4 = r4.getService(r5)
            com.taobao.android.fluid.framework.deprecated.message.IMessageService r4 = (com.taobao.android.fluid.framework.deprecated.message.IMessageService) r4
            tb.hmi r4 = r4.getMessageCenter()
            java.lang.String r5 = r9.type
            r5.hashCode()
            r6 = -1
            int r7 = r5.hashCode()
            switch(r7) {
                case -318370553: goto L_0x0056;
                case 3202370: goto L_0x004b;
                case 3529469: goto L_0x0041;
                case 1935998362: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r0 = -1
            goto L_0x0061
        L_0x0035:
            java.lang.String r0 = "updateGraymaskVisible"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x0033
        L_0x003f:
            r0 = 3
            goto L_0x0061
        L_0x0041:
            java.lang.String r1 = "show"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0061
            goto L_0x0033
        L_0x004b:
            java.lang.String r0 = "hide"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0054
            goto L_0x0033
        L_0x0054:
            r0 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r0 = "prepare"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0060
            goto L_0x0033
        L_0x0060:
            r0 = 0
        L_0x0061:
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0073;
                case 2: goto L_0x0069;
                case 3: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x007a
        L_0x0065:
            r8.j(r10)
            goto L_0x007a
        L_0x0069:
            r8.j(r10)
            r8.d()
            r8.x(r9, r4, r10)
            goto L_0x007a
        L_0x0073:
            r8.a()
            goto L_0x007a
        L_0x0077:
            r8.s(r4)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uj0.r(com.taobao.android.fluid.framework.data.datamodel.AlbumData, com.taobao.android.fluid.framework.data.datamodel.a$d):void");
    }
}
