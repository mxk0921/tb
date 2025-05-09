package tb;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.FontColorSelectorVO;
import com.tmall.stylekit.datatype.FontVO;
import com.tmall.stylekit.datatype.ShadowVO;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zmt extends qfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Typeface f32875a = null;

    static {
        t2o.a(1039138855);
    }

    public static /* synthetic */ Object ipc$super(zmt zmtVar, String str, Object... objArr) {
        if (str.hashCode() == -1666188206) {
            zmtVar.e((View) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/TextViewRender");
    }

    @Override // tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof TextView) && (textView = (TextView) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                j(textView, hashMap, cjdVar);
            }
        }
    }

    public void j(TextView textView, HashMap<String, Object> hashMap, cjd cjdVar) {
        Throwable th;
        int i = 3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e15dc4", new Object[]{this, textView, hashMap, cjdVar});
        } else if (textView != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(textView);
            }
            float f = 1.0f;
            float f2 = 1.0f;
            boolean z2 = false;
            FontVO fontVO = null;
            FontColorSelectorVO fontColorSelectorVO = null;
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                Object value = entry.getValue();
                try {
                    switch (cdw.a(valueOf)) {
                        case 10102:
                        case 10103:
                            textView.setText(Html.fromHtml(lra.s(value.toString())));
                            break;
                        case 10104:
                        case 10105:
                            textView.setTextColor(lra.b(value.toString()));
                            break;
                        case cdw.T_FONT_COLOR_SELECTOR /* 10106 */:
                        case cdw.T_TITLE_COLOR_SELECTOR /* 10107 */:
                            fontColorSelectorVO = (FontColorSelectorVO) ntq.i().a((JSONObject) value, FontColorSelectorVO.class);
                            break;
                        case cdw.T_FONT_WEIGHT /* 10108 */:
                            if (Integer.parseInt(value.toString()) > 400) {
                                z = true;
                                textView.getPaint().setFakeBoldText(true);
                                break;
                            }
                            z = true;
                            break;
                        case cdw.T_FAMILY_NAME /* 10109 */:
                        case 10110:
                            o(textView, value.toString());
                            z = true;
                            break;
                        case cdw.T_FONT_SIZE /* 10111 */:
                        case cdw.T_ICONFONT_SIZE /* 10112 */:
                            textView.setTextSize(0, lra.l(value.toString()));
                            z = true;
                            break;
                        case cdw.T_FONT /* 10113 */:
                            FontVO fontVO2 = (FontVO) ntq.i().a((JSONObject) value, FontVO.class);
                            if (fontVO2 != null) {
                                try {
                                    k(textView, fontVO2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fontVO = fontVO2;
                                    z = true;
                                    mgh.b(th);
                                    i = 3;
                                }
                            }
                            fontVO = fontVO2;
                            z = true;
                        case cdw.T_TRUNCATE_MODE /* 10118 */:
                            n(textView, value.toString());
                            z = true;
                            break;
                        case 10119:
                            textView.setGravity(c(Integer.parseInt(value.toString())));
                            z = true;
                            break;
                        case cdw.T_HINTTEXT /* 10120 */:
                            textView.setHint(lra.v(value.toString()));
                            z = true;
                            break;
                        case cdw.T_HINTTEXT_COLOR /* 10121 */:
                            textView.setHintTextColor(lra.b(value.toString()));
                            z = true;
                            break;
                        case cdw.T_LINES /* 10122 */:
                            textView.setLines(Integer.parseInt(value.toString()));
                            z = true;
                            break;
                        case cdw.T_NUMBER_OF_LINES /* 10123 */:
                        case cdw.T_MAX_LINES /* 10124 */:
                            textView.setMaxLines(Integer.parseInt(value.toString()));
                            z = true;
                            break;
                        case cdw.T_MIN_LINES /* 10125 */:
                            textView.setMinLines(Integer.parseInt(value.toString()));
                            z = true;
                            break;
                        case cdw.T_LINE_SPACING_EXTRA /* 10126 */:
                            if (!z2) {
                                z2 = true;
                            }
                            f = Float.parseFloat(value.toString());
                            z = true;
                            break;
                        case cdw.T_LINE_SPACING_MULTIPLIER /* 10127 */:
                            if (!z2) {
                                z2 = true;
                            }
                            f2 = Float.parseFloat(value.toString());
                            z = true;
                            break;
                        case cdw.T_SINGLE_LINE /* 10128 */:
                            textView.setSingleLine(Boolean.parseBoolean(value.toString()));
                            z = true;
                            break;
                        case cdw.T_LINE_TYPE /* 10129 */:
                            int parseInt = Integer.parseInt(value.toString());
                            if (parseInt == 2) {
                                textView.setPaintFlags(17);
                            } else if (parseInt == i) {
                                textView.setPaintFlags(9);
                            }
                            z = true;
                            break;
                        case cdw.T_SHADOW /* 10130 */:
                            try {
                                ShadowVO shadowVO = (ShadowVO) ntq.i().a((JSONObject) value, ShadowVO.class);
                                if (shadowVO != null) {
                                    m(textView, shadowVO);
                                }
                                z = true;
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                                mgh.b(th);
                                i = 3;
                            }
                        case cdw.T_EMS /* 10131 */:
                            textView.setEms(Integer.parseInt(value.toString()));
                            break;
                        case cdw.T_BOLD_FONT_SIZE /* 10132 */:
                            textView.setTextSize(0, lra.l(value.toString()));
                            textView.getPaint().setFakeBoldText(z);
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                i = 3;
            }
            e(textView, hashMap, null);
            if (z2) {
                textView.setLineSpacing(f, f2);
            }
            if (fontVO != null) {
                k(textView, fontVO);
            }
            if (fontColorSelectorVO != null) {
                l(textView, fontColorSelectorVO);
            }
            if (cjdVar != null) {
                cjdVar.a(textView);
            }
        }
    }

    public final void k(TextView textView, FontVO fontVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2e87d", new Object[]{this, textView, fontVO});
        } else if (fontVO != null) {
            if (!TextUtils.isEmpty(fontVO.fontSize)) {
                textView.setTextSize(0, lra.l(fontVO.fontSize));
            }
            o(textView, fontVO.familyName);
            if (fontVO.fontWeight > 400) {
                textView.getPaint().setFakeBoldText(true);
            } else {
                textView.getPaint().setFakeBoldText(false);
            }
        }
    }

    public final void l(TextView textView, FontColorSelectorVO fontColorSelectorVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707ece5f", new Object[]{this, textView, fontColorSelectorVO});
            return;
        }
        if (TextUtils.isEmpty(fontColorSelectorVO.titleNormalColor)) {
            fontColorSelectorVO.titleNormalColor = "#000000";
        }
        if (TextUtils.isEmpty(fontColorSelectorVO.titleDisabledColor)) {
            fontColorSelectorVO.titleDisabledColor = fontColorSelectorVO.titleNormalColor;
        }
        if (TextUtils.isEmpty(fontColorSelectorVO.titleHighlightedColor)) {
            fontColorSelectorVO.titleHighlightedColor = fontColorSelectorVO.titleNormalColor;
        }
        if (TextUtils.isEmpty(fontColorSelectorVO.titleSelectedColor)) {
            fontColorSelectorVO.titleSelectedColor = fontColorSelectorVO.titleNormalColor;
        }
        textView.setTextColor(new ColorStateList(new int[][]{cjq.d, cjq.f17103a, cjq.b, cjq.c}, new int[]{lra.b(fontColorSelectorVO.titleDisabledColor), lra.b(fontColorSelectorVO.titleHighlightedColor), lra.b(fontColorSelectorVO.titleSelectedColor), lra.b(fontColorSelectorVO.titleNormalColor)}));
    }

    public final void m(TextView textView, ShadowVO shadowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d2111b", new Object[]{this, textView, shadowVO});
        } else if (shadowVO != null) {
            textView.setShadowLayer(lra.m(shadowVO.shadowRadius), lra.l(shadowVO.shadowOffsetX), lra.l(shadowVO.shadowOffsetY), lra.b(shadowVO.shadowColor));
        }
    }

    public final void n(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b599af1c", new Object[]{this, textView, str});
        } else if ("start".equals(str)) {
            textView.setEllipsize(TextUtils.TruncateAt.START);
        } else if ("middle".equals(str)) {
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if ("marquee".equals(str)) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void o(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c635abee", new Object[]{this, textView, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("monospace".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.MONOSPACE);
            } else if ("serif".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.SERIF);
            } else if ("sans_serif".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.SANS_SERIF);
            } else if ("default_bold".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            } else if ("iconfont".equalsIgnoreCase(str)) {
                try {
                    if (this.f32875a == null) {
                        this.f32875a = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/iconfont.ttf");
                    }
                    textView.setTypeface(this.f32875a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    textView.setTypeface(Typeface.DEFAULT);
                }
            } else {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }
    }
}
