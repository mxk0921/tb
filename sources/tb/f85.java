package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class f85 extends i95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f19096a;
    public DWInteractiveVideoObject b;

    static {
        t2o.a(452985092);
        t2o.a(452985055);
    }

    public f85(DWContext dWContext) {
        this.f19096a = dWContext;
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWInteractive);
    }

    public static /* synthetic */ Object ipc$super(f85 f85Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/interactivelifecycle/display/DWInteractive");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.core.component.DWComponent a(com.taobao.avplayer.core.protocol.DWInteractiveObject r6, com.taobao.avplayer.DWVideoScreenType r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.f85.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "e8554f56"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            com.taobao.avplayer.core.component.DWComponent r6 = (com.taobao.avplayer.core.component.DWComponent) r6
            return r6
        L_0x001b:
            if (r6 != 0) goto L_0x001f
            r6 = 0
            return r6
        L_0x001f:
            com.taobao.avplayer.DWVideoScreenType r2 = com.taobao.avplayer.DWVideoScreenType.PORTRAIT_FULL_SCREEN
            if (r7 == r2) goto L_0x0050
            java.lang.String r2 = r6.getJsTemplateUrl()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0043
            com.taobao.avplayer.core.protocol.DWInteractiveVideoObject r3 = r5.b
            java.lang.String r3 = r3.getJsTemplateUrl(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0043
            com.taobao.avplayer.core.protocol.DWInteractiveVideoObject r1 = r5.b
            java.lang.String r1 = r1.getJsTemplateUrl(r2)
            r6.setJsTemplate(r1)
            goto L_0x0054
        L_0x0043:
            com.taobao.avplayer.core.protocol.DWInteractiveVideoObject r0 = r5.b
            java.lang.String r2 = r6.getJsTemplate()
            java.lang.String r0 = r0.getJsTemplate(r2)
            r6.setJsTemplate(r0)
        L_0x0050:
            java.lang.String r0 = ""
            r1 = r0
            r0 = 0
        L_0x0054:
            java.lang.Class r2 = r5.c(r6)
            com.taobao.avplayer.DWContext r3 = r5.f19096a
            com.taobao.avplayer.core.component.DWComponent r6 = tb.w65.a(r2, r3, r6, r7)
            if (r6 == 0) goto L_0x0069
            boolean r7 = r5.d()
            if (r7 != 0) goto L_0x0069
            r6.renderView()
        L_0x0069:
            if (r6 == 0) goto L_0x0070
            r6.isUrlMode = r0
            r6.setJsUrl(r1)
        L_0x0070:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f85.a(com.taobao.avplayer.core.protocol.DWInteractiveObject, com.taobao.avplayer.DWVideoScreenType):com.taobao.avplayer.core.component.DWComponent");
    }

    public x65 b(DWTimelineObject dWTimelineObject, DWVideoScreenType dWVideoScreenType) {
        DWInteractiveObject dWInteractiveObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x65) ipChange.ipc$dispatch("ab68f010", new Object[]{this, dWTimelineObject, dWVideoScreenType});
        }
        try {
            if (dWVideoScreenType != DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                dWInteractiveObject = dWTimelineObject.getPortraitMode();
            } else {
                dWInteractiveObject = dWTimelineObject.getLandscapeMode();
            }
        } catch (JSONException e) {
            e.printStackTrace();
            dWInteractiveObject = null;
        }
        if (dWInteractiveObject == null) {
            return null;
        }
        DWContext dWContext = this.f19096a;
        if (!(dWContext == null || dWContext.getIctTmpCallback() == null || dWTimelineObject.mPortraitMode == null)) {
            this.f19096a.getIctTmpCallback().a(dWInteractiveObject, dWVideoScreenType);
        }
        x65 x65Var = new x65();
        x65Var.f31174a = a(dWInteractiveObject, dWVideoScreenType);
        dWInteractiveObject.getLayout();
        return x65Var;
    }

    public abstract Class<? extends DWComponent> c(DWInteractiveObject dWInteractiveObject);

    public abstract boolean d();

    public void e(x65 x65Var, x65 x65Var2, x65 x65Var3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9095ade7", new Object[]{this, x65Var, x65Var2, x65Var3});
        } else if (x65Var != null && x65Var2 != null && x65Var3 != null && x65Var.f31174a != null && x65Var2.f31174a != null && x65Var3.f31174a != null) {
            this.f19096a.getDWComponentManager().b(x65Var.f31174a.getDWComponentInstance(), x65Var2.f31174a.getDWComponentInstance(), x65Var3.f31174a.getDWComponentInstance(), new z65());
        }
    }

    public void f(DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28925a2b", new Object[]{this, dWInteractiveVideoObject});
        } else {
            this.b = dWInteractiveVideoObject;
        }
    }
}
