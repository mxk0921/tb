package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.bubble")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dm0 extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SharedPreferences e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopupWindow f17907a;

        public a(dm0 dm0Var, PopupWindow popupWindow) {
            this.f17907a = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f17907a.dismiss();
            }
        }
    }

    static {
        t2o.a(301989969);
    }

    public static /* synthetic */ Object ipc$super(dm0 dm0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/bubble/AliBuyBubbleExtension");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        Context f = J0().f();
        if (!(f instanceof Activity)) {
            ck.g().d("context is not Activity Type !!");
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (bh.b(c)) {
            ck.g().d("eventFields is null !!");
            return;
        }
        JSONObject jSONObject = c.getJSONObject("params");
        if (bh.b(jSONObject)) {
            ck.g().d("params is null !!");
            return;
        }
        String string = jSONObject.getString("content");
        if (TextUtils.isEmpty(string)) {
            ck.g().d("content is null !!");
            return;
        }
        String string2 = jSONObject.getString("showOnceCode");
        if (TextUtils.isEmpty(string2) || R0(f, string2)) {
            Q0((Activity) f, eventModel, string);
        } else {
            ck.g().d("needShown is false !!");
        }
    }

    public final void O0(DXRuntimeContext dXRuntimeContext, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f769f42", new Object[]{this, dXRuntimeContext, iArr});
            return;
        }
        DXWidgetNode W = dXRuntimeContext.W();
        int left = W.getLeft();
        int width = W.getWidth();
        int height = W.getHeight();
        iArr[0] = left - (width / 2);
        iArr[1] = km0.a(J0().f()) + km0.b(J0().f()) + height;
    }

    public final void P0(View view, Activity activity, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df831ca", new Object[]{this, view, activity, str, new Integer(i), new Integer(i2)});
        } else if (!activity.isFinishing()) {
            PopupWindow popupWindow = new PopupWindow();
            View inflate = LayoutInflater.from(activity).inflate(R.layout.alibuy_bubble_layout, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.content);
            textView.setText(str);
            textView.setOnClickListener(new a(this, popupWindow));
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            popupWindow.setTouchable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(new BitmapDrawable(activity.getResources(), (Bitmap) null));
            try {
                popupWindow.showAtLocation(view, 51, i, i2);
            } catch (Throwable th) {
                ck.g().d(th.getMessage());
            }
        }
    }

    public final void Q0(Activity activity, qi qiVar, String str) {
        DXRuntimeContext dXRuntimeContext;
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca258bdd", new Object[]{this, activity, qiVar, str});
            return;
        }
        int[] iArr = new int[2];
        Object obj = qiVar.h().get(qi.EXT_KEY_DX_RUNTIME_CONTEXT);
        if ((obj instanceof DXRuntimeContext) && (D = (dXRuntimeContext = (DXRuntimeContext) obj).D()) != null) {
            O0(dXRuntimeContext, iArr);
            P0(D, activity, str, iArr[0], iArr[1]);
        }
    }

    public final boolean R0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a621ff", new Object[]{this, context, str})).booleanValue();
        }
        if (this.e == null) {
            this.e = context.getSharedPreferences("AliBuyDialogExtension", 0);
        }
        if (this.e.getInt(str, 0) == 1) {
            return false;
        }
        this.e.edit().putInt(str, 1).apply();
        return true;
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "bubble";
    }
}
