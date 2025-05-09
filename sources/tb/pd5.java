package tb;

import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pd5 implements lyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26027a;
        public final /* synthetic */ Object b;

        public a(View view, Object obj) {
            this.f26027a = view;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXWidgetNode b = kl6.b(this.f26027a);
                if (b != null) {
                    int intValue = Double.valueOf("" + this.b).intValue();
                    b.setMeasuredDimension(intValue, b.getMeasuredHeight());
                    ViewGroup.LayoutParams layoutParams = this.f26027a.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = intValue;
                        this.f26027a.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26028a;
        public final /* synthetic */ Object b;

        public b(View view, Object obj) {
            this.f26028a = view;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXWidgetNode b = kl6.b(this.f26028a);
                if (b != null) {
                    int intValue = Double.valueOf("" + this.b).intValue();
                    b.setMeasuredDimension(b.getMeasuredWidth(), intValue);
                    ViewGroup.LayoutParams layoutParams = this.f26028a.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                        this.f26028a.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    static {
        t2o.a(444596648);
    }

    @Override // tb.lyc
    public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
        DinamicXEngine f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            return;
        }
        if (DinamicXEngine.j0()) {
            h36.q("开始更新" + str + " 属性，需要更新到的值为 " + obj + " 更新前的值为 " + b(str, view) + " 其对应的view为 " + view);
        }
        DXWidgetNode b2 = kl6.b(view);
        if (b2 == null || b2.getDXRuntimeContext() == null || (f = b2.getDXRuntimeContext().s().f()) == null || f.N() == null || !f.N().a(view, str, obj, cVar, map)) {
            if (!TextUtils.isEmpty(str) && view != null) {
                str.hashCode();
                if (str.equals("height")) {
                    b bVar = new b(view, obj);
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar.run();
                        return;
                    } else {
                        jb6.n(bVar);
                        return;
                    }
                } else if (str.equals("width")) {
                    a aVar = new a(view, obj);
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        aVar.run();
                        return;
                    } else {
                        jb6.n(aVar);
                        return;
                    }
                }
            }
            lyc e = dmj.e(str);
            if (e != null) {
                e.a(view, str, obj, cVar, map);
            }
            if (DinamicXEngine.j0()) {
                h36.q("更新完成" + str + " 属性，需要更新到的值为 " + obj + " 更新后的值为 " + b(str, view) + " 其对应的view为 " + view);
            }
        }
    }

    public final Object b(String str, View view) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f320b417", new Object[]{this, str, view});
        }
        try {
            switch (str.hashCode()) {
                case -1971608035:
                    if (str.equals("transform.rotate")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1954617072:
                    if (str.equals("transform.scaleX")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1954617071:
                    if (str.equals("transform.scaleY")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1744318324:
                    if (str.equals("transform.translateX")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1744318323:
                    if (str.equals("transform.translateY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1725620152:
                    if (str.equals("transform.scale")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -990306853:
                    if (str.equals("transform.rotateX")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -990306852:
                    if (str.equals("transform.rotateY")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -990306851:
                    if (str.equals("transform.rotateZ")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -194815668:
                    if (str.equals("transform.translate")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 605322756:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_color)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return "width:" + view.getLayoutParams().width;
                case 1:
                    return "height: " + view.getLayoutParams().height;
                case 2:
                    return "opacity: " + view.getAlpha();
                case 3:
                    return "translateX :" + view.getTranslationX();
                case 4:
                    return "translateY: " + view.getTranslationY();
                case 5:
                    return "translateX :" + view.getTranslationX() + " translateY: " + view.getTranslationY();
                case 6:
                    return "scaleX: " + view.getScaleX();
                case 7:
                    return "scaleY: " + view.getScaleY();
                case '\b':
                    return "scaleX: " + view.getScaleX() + "scaleY: " + view.getScaleY();
                case '\t':
                    return "rotate :" + view.getRotation();
                case '\n':
                    return "rotateZ :" + view.getRotation();
                case 11:
                    return "rotateX :" + view.getRotationX();
                case '\f':
                    return "rotateY :" + view.getRotationY();
                case '\r':
                    if (!(view.getBackground() instanceof ColorDrawable)) {
                        return "targetView.getBackground() 不是ColorDrawable";
                    }
                    return "background-color:  " + ((ColorDrawable) view.getBackground()).getColor();
                case 14:
                    if (!(view instanceof TextView)) {
                        return "targetView 不是TextView";
                    }
                    int currentTextColor = ((TextView) view).getCurrentTextColor();
                    return "textColor:  " + currentTextColor;
            }
        } catch (Exception e) {
            xv5.b(e);
        }
        return str + " 当前属性不支持";
    }
}
