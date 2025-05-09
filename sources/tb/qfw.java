package tb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.BackgroundColorSelector;
import com.tmall.stylekit.datatype.BorderSelector;
import com.tmall.stylekit.datatype.GradientColorVO;
import com.tmall.stylekit.datatype.MarginVO;
import com.tmall.stylekit.datatype.PaddingVO;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qfw extends cik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138856);
    }

    public static void f(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{view, drawable});
        } else if (view != null && drawable != null) {
            view.setBackground(drawable);
        }
    }

    public static /* synthetic */ Object ipc$super(qfw qfwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/ViewRender");
    }

    @Override // tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if (obj instanceof View) {
            View view = (View) obj;
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (view != null && hashMap != null && hashMap.size() != 0) {
                e(view, hashMap, cjdVar);
            }
        }
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("433e8efb", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || i > 19) {
            return 0;
        }
        switch (i) {
            case 1:
            case 4:
            case 7:
            case 11:
            case 14:
            case 17:
                return 3;
            case 2:
            case 5:
            case 8:
            case 12:
            case 15:
            case 18:
                return 1;
            case 3:
            case 6:
            case 9:
            case 13:
            case 16:
            case 19:
                return 5;
            case 10:
            default:
                return 0;
        }
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eede5f5", new Object[]{this, new Integer(i)})).intValue();
        }
        return b(i) | d(i);
    }

    public int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4e325df", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || i > 19) {
            return 0;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 11:
            case 12:
            case 13:
                return 48;
            case 4:
            case 5:
            case 6:
            case 14:
            case 15:
            case 16:
                return 16;
            case 7:
            case 8:
            case 9:
            case 17:
            case 18:
            case 19:
                return 80;
            case 10:
            default:
                return 0;
        }
    }

    public final void g(View view, int i, int i2, int i3, int i4, int i5, MarginVO marginVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98470836", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), marginVO});
            return;
        }
        View view2 = (View) view.getParent();
        if (i > 0) {
            i = (int) (i + i3);
        }
        if (i2 > 0) {
            i2 = (int) (i2 + i3);
        }
        if (view2 != null) {
            if (view2 instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                if (i >= -2 && i != 0) {
                    layoutParams.width = i;
                }
                if (i2 >= -2 && i2 != 0) {
                    layoutParams.height = i2;
                }
                if (marginVO != null) {
                    layoutParams.setMargins(lra.m(marginVO.marginLeft), lra.m(marginVO.marginTop), lra.m(marginVO.marginRight), lra.m(marginVO.marginBottom));
                }
                float f = i4;
                if (f > 0.0f) {
                    layoutParams.weight = f;
                }
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(c(i5));
                }
                view.setLayoutParams(layoutParams);
            } else if (view2 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                }
                if (i >= -2 && i != 0) {
                    layoutParams2.width = i;
                }
                if (i2 >= -2 && i2 != 0) {
                    layoutParams2.height = i2;
                }
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(c(i5));
                }
                if (marginVO != null) {
                    layoutParams2.setMargins(lra.m(marginVO.marginLeft), lra.m(marginVO.marginTop), lra.m(marginVO.marginRight), lra.m(marginVO.marginBottom));
                }
                view.setLayoutParams(layoutParams2);
            } else if (view2 instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                }
                if (i >= -2 && i != 0) {
                    layoutParams3.width = i;
                }
                if (i2 >= -2 && i2 != 0) {
                    layoutParams3.height = i2;
                }
                layoutParams3.gravity = 48;
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(c(i5));
                }
                if (marginVO != null) {
                    layoutParams3.setMargins(lra.m(marginVO.marginLeft), lra.m(marginVO.marginTop), lra.m(marginVO.marginRight), lra.m(marginVO.marginBottom));
                }
                view.setLayoutParams(layoutParams3);
            } else if (view2 instanceof ListView) {
                AbsListView.LayoutParams layoutParams4 = (AbsListView.LayoutParams) view.getLayoutParams();
                if (layoutParams4 == null) {
                    layoutParams4 = new AbsListView.LayoutParams(-2, -2);
                }
                if (i >= -2 && i != 0) {
                    layoutParams4.width = i;
                }
                if (i2 >= -2 && i2 != 0) {
                    layoutParams4.height = i2;
                }
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(c(i5));
                }
                view.setLayoutParams(layoutParams4);
            }
        } else if (marginVO != null) {
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (i >= -2 && i != 0) {
                    marginLayoutParams.width = i;
                }
                if (i2 >= -2 && i2 != 0) {
                    marginLayoutParams.height = i2;
                }
                marginLayoutParams.setMargins(lra.m(marginVO.marginLeft), lra.m(marginVO.marginTop), lra.m(marginVO.marginRight), lra.m(marginVO.marginBottom));
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(c(i5));
                }
                view.setLayoutParams(marginLayoutParams);
            } catch (Throwable unused) {
            }
        }
    }

    public final void h(View view, PaddingVO paddingVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae027d91", new Object[]{this, view, paddingVO});
        } else {
            view.setPadding(lra.m(paddingVO.paddingLeft), lra.m(paddingVO.paddingTop), lra.m(paddingVO.paddingRight), lra.m(paddingVO.paddingBottom));
        }
    }

    public final void i(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47983928", new Object[]{this, view, new Integer(i)});
        } else if (i == -1) {
            view.setVisibility(4);
        } else if (i != 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public void e(View view, HashMap<String, Object> hashMap, cjd cjdVar) {
        Throwable th;
        JSONArray jSONArray;
        String str = "colors";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caffc52", new Object[]{this, view, hashMap, cjdVar});
        } else if (view != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(view);
            }
            Iterator<Map.Entry<String, Object>> it = hashMap.entrySet().iterator();
            PaddingVO paddingVO = null;
            e05 e05Var = null;
            MarginVO marginVO = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String valueOf = String.valueOf(next.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = next.getValue();
                    try {
                        int a2 = cdw.a(valueOf);
                        if (a2 == 10210) {
                            str = str;
                            it = it;
                            view.setMinimumHeight(lra.m(value.toString()));
                        } else if (a2 != 10211) {
                            switch (a2) {
                                case 10002:
                                    str = str;
                                    it = it;
                                    i(view, Integer.parseInt(value.toString()));
                                    break;
                                case 10003:
                                    str = str;
                                    it = it;
                                    BackgroundColorSelector backgroundColorSelector = (BackgroundColorSelector) ntq.i().a((JSONObject) value, BackgroundColorSelector.class);
                                    if (backgroundColorSelector == null) {
                                        break;
                                    } else {
                                        if (e05Var == null) {
                                            e05Var = new e05();
                                        }
                                        e05Var.c(lra.b(backgroundColorSelector.backgroundNormalColor));
                                        e05Var.e(lra.b(backgroundColorSelector.backgroundSelectedColor));
                                        e05Var.d(lra.b(backgroundColorSelector.backgroundHighlightedColor));
                                        e05Var.f(lra.b(backgroundColorSelector.backgroundDisabledColor));
                                        break;
                                    }
                                case 10004:
                                    str = str;
                                    it = it;
                                    if (e05Var == null) {
                                        e05Var = new e05();
                                    }
                                    e05Var.b(lra.b(value.toString()));
                                    break;
                                case 10005:
                                    str = str;
                                    it = it;
                                    String obj = value.toString();
                                    if (!obj.startsWith(lra.DRAWABLE_RESOURCE)) {
                                        if (ntq.i().l() == null) {
                                            break;
                                        } else {
                                            ntq.i().l().b(view, value.toString());
                                            break;
                                        }
                                    } else {
                                        f(view, lra.p(obj));
                                        break;
                                    }
                                case 10006:
                                case 10007:
                                    str = str;
                                    it = it;
                                    i = lra.m(value.toString());
                                    break;
                                case 10008:
                                case 10009:
                                    str = str;
                                    it = it;
                                    i2 = lra.m(value.toString());
                                    break;
                                case 10010:
                                    str = str;
                                    it = it;
                                    paddingVO = (PaddingVO) ntq.i().a((JSONObject) value, PaddingVO.class);
                                    break;
                                case 10011:
                                case 10012:
                                    str = str;
                                    it = it;
                                    marginVO = (MarginVO) ntq.i().a((JSONObject) value, MarginVO.class);
                                    break;
                                case 10013:
                                case cdw.T_BORDER_WIDTH /* 10014 */:
                                    str = str;
                                    it = it;
                                    i3 = lra.m(value.toString());
                                    if (i3 > 0) {
                                        if (e05Var == null) {
                                            e05Var = new e05();
                                        }
                                        e05Var.l(i3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10015:
                                case 10016:
                                    str = str;
                                    it = it;
                                    if (e05Var == null) {
                                        e05Var = new e05();
                                    }
                                    e05Var.g(lra.b(value.toString()));
                                    break;
                                case cdw.T_BORDER_SELECTOR /* 10017 */:
                                    str = str;
                                    it = it;
                                    BorderSelector borderSelector = (BorderSelector) ntq.i().a((JSONObject) value, BorderSelector.class);
                                    if (borderSelector == null) {
                                        break;
                                    } else {
                                        if (e05Var == null) {
                                            e05Var = new e05();
                                        }
                                        e05Var.h(lra.b(borderSelector.borderNormalColor));
                                        e05Var.j(lra.b(borderSelector.borderSelectedColor));
                                        e05Var.i(lra.b(borderSelector.borderHighlightedColor));
                                        e05Var.k(lra.b(borderSelector.borderDisabledColor));
                                        break;
                                    }
                                case cdw.T_CORNER_RADIUS /* 10018 */:
                                    str = str;
                                    it = it;
                                    if (e05Var == null) {
                                        e05Var = new e05();
                                    }
                                    e05Var.m(lra.m(value.toString()));
                                    break;
                                case cdw.T_GRADIENT_BACKGROUND_COLOR /* 10019 */:
                                    JSONObject parseObject = JSON.parseObject(value.toString());
                                    if (!(!parseObject.containsKey(str) || (jSONArray = parseObject.getJSONArray(str)) == null || jSONArray.size() == 0)) {
                                        GradientColorVO gradientColorVO = new GradientColorVO();
                                        str = str;
                                        try {
                                            int size = jSONArray.size();
                                            it = it;
                                            try {
                                                gradientColorVO.colors = new int[size];
                                                int i5 = 0;
                                                while (i5 < size) {
                                                    gradientColorVO.colors[i5] = Color.parseColor(jSONArray.get(i5).toString());
                                                    i5++;
                                                    size = size;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                mgh.b(th);
                                            }
                                            try {
                                                if (parseObject.containsKey("type")) {
                                                    gradientColorVO.type = Integer.parseInt(parseObject.get("type").toString());
                                                }
                                                if (e05Var == null) {
                                                    e05Var = new e05();
                                                }
                                                e05Var.n(gradientColorVO);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                mgh.b(th);
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            it = it;
                                            mgh.b(th);
                                        }
                                    }
                                    break;
                                case cdw.T_ALPHA /* 10020 */:
                                    view.setAlpha(Float.parseFloat(value.toString()));
                                    break;
                                case 10021:
                                    i4 = Integer.parseInt(value.toString());
                                    break;
                            }
                        } else {
                            str = str;
                            it = it;
                            view.setMinimumWidth(lra.m(value.toString()));
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str = str;
                    }
                }
                str = str;
                it = it;
            }
            g(view, i, i2, i3, 0, i4, marginVO);
            if (paddingVO != null) {
                h(view, paddingVO);
            }
            if (e05Var != null) {
                f(view, e05Var.a(view));
            }
            if (cjdVar != null) {
                cjdVar.a(view);
            }
        }
    }
}
