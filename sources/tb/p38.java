package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p38 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEXTVIEW_TEXTVIEW = -2672364288628517304L;
    public static final int ELLIPSIZE_CHAR = 4;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f25854a = new ConcurrentHashMap();
    public static boolean b = false;

    static {
        t2o.a(478151101);
    }

    public static /* synthetic */ Object ipc$super(p38 p38Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1814733277) {
            return super.onCreateView((Context) objArr[0]);
        }
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/DxTextViewBreakWidgetNode");
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca77df0f", new Object[0]);
        } else {
            ((ConcurrentHashMap) f25854a).clear();
        }
    }

    public static String u(TextView textView, String str, gi6 gi6Var) {
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f04614", new Object[]{textView, str2, gi6Var});
        }
        float measuredWidth = (gi6Var.getMeasuredWidth() - gi6Var.getPaddingLeft()) - gi6Var.getPaddingRight();
        if (!TextUtils.isEmpty(str) && measuredWidth > 0.0f) {
            String str3 = measuredWidth + "_" + str2;
            String str4 = (String) ((ConcurrentHashMap) f25854a).get(str3);
            if (b && str4 != null) {
                return str4;
            }
            String[] split = str2.replaceAll("\r", "").split("\n");
            StringBuilder sb = new StringBuilder();
            int length = split.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i;
                String str5 = split[i2];
                boolean z = true;
                while (z && i3 < gi6Var.getMaxLines()) {
                    int breakText = textView.getPaint().breakText(str5, 0, str5.length(), true, measuredWidth, null);
                    if (breakText < str5.length()) {
                        sb.append(str5.substring(0, breakText));
                        str5 = str5.substring(breakText);
                    } else {
                        sb.append(str5);
                        str5 = str5;
                        z = false;
                    }
                    sb.append("\n");
                    i3++;
                    i2 = i2;
                }
                i2++;
                i = i3;
            }
            if (!str2.endsWith("\n")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            str2 = sb.toString();
            if (b) {
                ((ConcurrentHashMap) f25854a).put(str3, str2);
            }
        }
        return str2;
    }

    public static void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538ec9f", new Object[0]);
        } else {
            b = v9v.i("cart_switch", "useEllipsizeTextCache", true);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new p38();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        String w = w(view, this);
        if (w != null && (view instanceof TextView)) {
            setNativeText((TextView) view, w);
        }
    }

    public static String w(View view, gi6 gi6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f114b8", new Object[]{view, gi6Var});
        }
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        if (gi6Var.getLineBreakMode() != 4) {
            return null;
        }
        try {
            String u = u(textView, textView.getText().toString(), gi6Var);
            gi6Var.setText(u);
            return u;
        } catch (Exception unused) {
            UnifyLog.j("DxTextViewBreakWidgetNode", "split char error", new Object[0]);
            return null;
        }
    }
}
