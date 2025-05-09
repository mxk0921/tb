package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999914);
    }

    public final int b(Context context, jl1 jl1Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfdf8161", new Object[]{this, context, jl1Var, str})).intValue();
        }
        try {
            if ("100%".equals(str)) {
                return -1;
            }
            return (int) jl1Var.c(context, !TextUtils.isEmpty(str) ? Float.parseFloat(str) : 0.0f);
        } catch (Throwable th) {
            wdm.h("transWidthAndHeight.error.", th);
            return 0;
        }
    }

    public FrameLayout.LayoutParams a(View view, PopRequest popRequest, jl1 jl1Var) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("621de288", new Object[]{this, view, popRequest, jl1Var});
        }
        FrameLayout.LayoutParams layoutParams = null;
        if (view == null || popRequest == null || jl1Var == null) {
            return null;
        }
        try {
            BaseConfigItem J = a.J(popRequest);
            if (J == null) {
                return null;
            }
            StyleModel styleModel = J.styleConfigs;
            char c = 65535;
            if (styleModel != null && styleModel.isValid()) {
                Context context = view.getContext();
                if ("fullscreen".equals(styleModel.layout)) {
                    return new FrameLayout.LayoutParams(-1, -1);
                }
                float b = b(context, jl1Var, styleModel.width);
                float b2 = b(context, jl1Var, styleModel.height);
                float c2 = jl1Var.c(context, Float.parseFloat(styleModel.offsetLeft));
                float c3 = jl1Var.c(context, Float.parseFloat(styleModel.offsetRight));
                float c4 = jl1Var.c(context, Float.parseFloat(styleModel.offsetTop)) + popRequest.g();
                float c5 = jl1Var.c(context, Float.parseFloat(styleModel.offsetBottom));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b, (int) b2);
                try {
                    String str = styleModel.layout;
                    switch (str.hashCode()) {
                        case -1436089959:
                            if (str.equals("rightTop")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1364013995:
                            if (str.equals("center")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -901823641:
                            if (str.equals("rightBottom")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -632276239:
                            if (str.equals("bottomFloat")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 55433166:
                            if (str.equals("leftTop")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1626916114:
                            if (str.equals("leftBottom")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        layoutParams2.gravity = 17;
                        layoutParams2.leftMargin = (int) c2;
                        layoutParams2.topMargin = (int) c4;
                    } else if (c == 1) {
                        layoutParams2.gravity = 51;
                        layoutParams2.leftMargin = (int) c2;
                        layoutParams2.topMargin = (int) c4;
                    } else if (c == 2) {
                        layoutParams2.gravity = 53;
                        layoutParams2.rightMargin = (int) c3;
                        layoutParams2.topMargin = (int) c4;
                    } else if (c == 3) {
                        layoutParams2.gravity = 83;
                        layoutParams2.leftMargin = (int) c2;
                        layoutParams2.bottomMargin = (int) c5;
                    } else if (c == 4) {
                        layoutParams2.gravity = 85;
                        layoutParams2.rightMargin = (int) c3;
                        layoutParams2.bottomMargin = (int) c5;
                    } else if (c == 5) {
                        layoutParams2.gravity = 83;
                        layoutParams2.leftMargin = (int) c2;
                        layoutParams2.bottomMargin = ((int) c5) + lyv.a(context, 48);
                    }
                    return layoutParams2;
                } catch (Throwable th2) {
                    th = th2;
                    layoutParams = layoutParams2;
                    wdm.h("PopViewStyle.getPopViewStyle.error", th);
                    return layoutParams;
                }
            }
            return new FrameLayout.LayoutParams(-1, -1);
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
