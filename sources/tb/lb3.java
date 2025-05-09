package tb;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.kb3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lb3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements kb3.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopupWindow f23228a;

        public a(lb3 lb3Var, PopupWindow popupWindow) {
            this.f23228a = popupWindow;
        }

        @Override // tb.kb3.e
        public void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            } else {
                this.f23228a.dismiss();
            }
        }
    }

    static {
        t2o.a(479199385);
    }

    public static /* synthetic */ Object ipc$super(lb3 lb3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartGroupSubmitSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        tka tkaVar = (tka) lcuVar.e(tka.TAG);
        if (tkaVar != null && tkaVar.a() != null && !tkaVar.a().isEmpty()) {
            r(new kb3(this.j, tkaVar, this.e));
            p(lcuVar);
        }
    }

    public final void p(lcu lcuVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f313b3", new Object[]{this, lcuVar});
        } else if (lcuVar != null) {
            List<IDMComponent> list = (List) lcuVar.c();
            tka tkaVar = (tka) lcuVar.e(tka.TAG);
            if (!(list == null || tkaVar == null)) {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent.getFields() != null) {
                        String string = iDMComponent.getFields().getString("bizCode");
                        if (!TextUtils.isEmpty(string) && !arrayList.contains(string)) {
                            arrayList.add(string);
                            sb.append(string);
                            sb.append(",");
                        }
                    }
                }
                if (lcuVar.a() == null || lcuVar.a().getFields() == null) {
                    str = "";
                } else {
                    str = lcuVar.a().getFields().getString("isChecked");
                }
                juv.b(this.j, "Page_ShoppingCart_Button-Pay", "shopCount=" + q(tkaVar), "selectedBizCode=" + sb.toString(), "isSelectAll=" + str);
                juv.b(this.j, "Page_ShoppingCart_GroupSubmit", "isSelectAll=" + str, "groupsize=" + tkaVar.a().size(), "shopCount=" + q(tkaVar), "selectedBizCode=" + sb.toString(), "quantity=" + lcuVar.a().getFields().getString("quantity"));
            }
        }
    }

    public int q(tka tkaVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("394eb554", new Object[]{this, tkaVar})).intValue();
        }
        if (!(tkaVar == null || tkaVar.a() == null)) {
            for (ska skaVar : tkaVar.a()) {
                if (skaVar.h() != null) {
                    i += skaVar.h().size();
                }
            }
        }
        return i;
    }

    public void r(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a428f2", new Object[]{this, kb3Var});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.b);
        frameLayout.addView(kb3Var.r(), new FrameLayout.LayoutParams(-1, -1, 80));
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        PopupWindow popupWindow = new PopupWindow(this.b);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-1);
        popupWindow.setSoftInputMode(16);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setContentView(frameLayout);
        popupWindow.showAtLocation(frameLayout, 48, 0, 0);
        kb3Var.t();
        kb3Var.w(new a(this, popupWindow));
        UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
    }
}
