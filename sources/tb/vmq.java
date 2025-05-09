package tb;

import android.text.TextUtils;
import com.alibaba.marvel.Const;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.marvel.java.TextType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.PasterChildNode;
import com.taobao.android.litecreator.sdk.editor.data.Transform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ltl;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class vmq extends ltl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tqc f30111a;
    public final boolean b = eag.P();

    static {
        t2o.a(511705392);
    }

    public vmq(tqc tqcVar) {
        this.f30111a = tqcVar;
    }

    public static double B(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b06846b", new Object[]{new Double(d)})).doubleValue();
        }
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return d;
    }

    public static /* synthetic */ Object ipc$super(vmq vmqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/StickerEditorDifferCBV2");
    }

    public abstract long A();

    public final void C(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0f48f8", new Object[]{this, paster});
        } else {
            h5i.m(this.f30111a.h0(), paster.textFontPath);
        }
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void g(Paster paster) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79332cfd", new Object[]{this, paster});
            return;
        }
        if (paster.extra != null) {
            z = false;
        }
        String o = o(paster);
        p(o, paster);
        r(o, paster);
        if (!paster.isInTemplate) {
            v(o, paster);
            s(o, paster);
            u(o, paster);
            w(o, paster);
            t(o, paster);
            y(o, paster);
        }
        if (paster.type != 0 || paster.resType != 3 || !z) {
            x(o, paster);
        }
    }

    public final String o(Paster paster) {
        long A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7e6495d", new Object[]{this, paster});
        }
        if (paster.isInTemplate || paster.isInDraft) {
            Object obj = paster.extra;
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        int i = paster.type;
        if (i == 1) {
            C(paster);
            String addTextClip = this.f30111a.h0().addTextClip("", "", 0L, A());
            paster.extra = addTextClip;
            return addTextClip;
        } else if (i == 2) {
            String addTextTemplateClip = this.f30111a.h0().addTextTemplateClip("", paster.resPath, 0L, A(), (ResourceInspector) null);
            paster.extra = addTextTemplateClip;
            this.f30111a.h0().setTextTemplateExtParam(addTextTemplateClip, 0, "Script_ImagePath", paster.itemImageLocalPath);
            return addTextTemplateClip;
        } else {
            int i2 = paster.resType;
            if (i2 == 1 || i2 == 2) {
                String addPipClip = this.f30111a.h0().addPipClip("", paster.path, 0L, 0L, A());
                paster.extra = addPipClip;
                return addPipClip;
            } else if (i2 == 3) {
                MeEditor h0 = this.f30111a.h0();
                String str = paster.resPath;
                if (this.b) {
                    A = -1;
                } else {
                    A = A();
                }
                String addSubProjectClip = h0.addSubProjectClip("", str, 0L, 0L, A);
                paster.extra = addSubProjectClip;
                return addSubProjectClip;
            } else {
                String addStickerClip = this.f30111a.h0().addStickerClip("", paster.resPath, 0L, A());
                paster.extra = addStickerClip;
                return addStickerClip;
            }
        }
    }

    public final void p(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66894753", new Object[]{this, str, paster});
        } else if (!TextUtils.isEmpty(str) && this.f30111a.h0() != null) {
            if (paster.resType != 3 || !this.b) {
                this.f30111a.h0().setClipStartTimeUs(str, paster.startTimeUs);
                this.f30111a.h0().setSourceEndTimeUs(str, paster.endTimeUs - paster.startTimeUs);
                i5i.b(this.f30111a.h0(), str, paster.endTimeUs - paster.startTimeUs);
                return;
            }
            this.f30111a.h0().setClipStartTimeUs(str, paster.startTimeUs);
            this.f30111a.h0().setClipEndTimeUs(str, paster.endTimeUs);
            if (paster.type == 3) {
                this.f30111a.h0().setClipLoopType(str, Const.ClipLoopType.kLoop);
                this.f30111a.h0().setClipEndTimeUs(str, paster.endTimeUs);
            }
        }
    }

    public final void r(String str, Paster paster) {
        List<PasterChildNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cce15a", new Object[]{this, str, paster});
            return;
        }
        MeEditor h0 = this.f30111a.h0();
        int i = paster.type;
        if (i == 1) {
            h0.setText(str, paster.text);
        } else if (i == 2) {
            h0.setTextTemplateContent(str, 0, paster.text);
        } else if (i == 3 && (list = paster.pasterChildNodes) != null && list.size() > 0) {
            h5i.l(h0, h5i.g(h0, str));
            for (PasterChildNode pasterChildNode : list) {
                h0.setText(pasterChildNode.clipId, pasterChildNode.content);
                if (pasterChildNode.isEdit) {
                    h0.setText(pasterChildNode.clipId, paster.text);
                    pasterChildNode.content = paster.text;
                }
            }
            h5i.k(h0);
        }
    }

    public final void s(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60b19cd", new Object[]{this, str, paster});
        } else if (paster.type == 1 && !z(paster)) {
            MeEditor h0 = this.f30111a.h0();
            int i = paster.textColor;
            if (i == 0) {
                i = -1;
            }
            h0.setTextColor(str, i);
        }
    }

    public final void t(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36322acb", new Object[]{this, str, paster});
        } else if (paster.type == 1 && !TextUtils.isEmpty(paster.textFontPath)) {
            this.f30111a.h0().setTextFont(str, paster.textFontPath);
        }
    }

    public final void u(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448bdb19", new Object[]{this, str, paster});
        } else if (paster.type == 1 && !z(paster)) {
            this.f30111a.h0().setTextOutlineEnable(str, true);
            this.f30111a.h0().setTextOutlineSize(str, 2.0f);
            this.f30111a.h0().setTextOutlineColor(str, paster.outlineColor);
        }
    }

    public final void v(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb2e70", new Object[]{this, str, paster});
        } else if (paster.type == 1) {
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextUnknown, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextBase, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kColorText, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextAnimationIn, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextAnimationLoop, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextAnimationOut, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextBubble, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextAudio, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextCombo, "", (ResourceInspector) null);
            this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextWidget, "", (ResourceInspector) null);
            ArrayList arrayList = new ArrayList();
            this.f30111a.h0().getTextWidgetList(str, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f30111a.h0().removeTextWidget(str, (String) it.next());
            }
            if (!TextUtils.isEmpty(paster.resPath)) {
                this.f30111a.h0().setTextPropertiesByJson(str, TextType.kTextUnknown, paster.resPath, (ResourceInspector) null);
            }
        }
    }

    public final void w(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e4c6cd", new Object[]{this, str, paster});
        } else if (paster.type == 1 && !z(paster)) {
            this.f30111a.h0().setTextShadowEnable(str, true);
            this.f30111a.h0().setTextShadowOffsetX(str, 1.0f);
            this.f30111a.h0().setTextShadowOffsetY(str, 1.0f);
            this.f30111a.h0().setTextShadowColor(str, paster.shadowColor);
        }
    }

    public final void x(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7823457", new Object[]{this, str, paster});
        } else if (!TextUtils.isEmpty(str) && this.f30111a.h0() != null) {
            Transform transform = paster.transform;
            this.f30111a.h0().setScale(str, transform.scale);
            this.f30111a.h0().setRotate(str, (float) (((-transform.rotate) / 180.0f) * 3.141592653589793d));
            this.f30111a.h0().setPosition(str, transform.postionX, transform.postionY);
        }
    }

    public final void y(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5251ac0d", new Object[]{this, str, paster});
        } else if (paster.hasFlag(2)) {
            i5i.k(this.f30111a.h0(), str, paster.mute);
        }
    }

    public final boolean z(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eca45a4", new Object[]{this, paster})).booleanValue();
        }
        if (paster.type != 1) {
            return true;
        }
        return false;
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void a(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce909ba8", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onShadowColorUpdate:" + paster.toString());
        w(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void b(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312577f", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onTransformUpdate: " + paster.toString());
        if (paster.isInTemplate) {
            q(str, paster);
        } else {
            x(str, paster);
        }
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void c(Paster paster, Paster paster2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb107ae", new Object[]{this, paster, paster2});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onBringTopFront======>");
        if (!eag.e()) {
            g(paster2);
            f(paster);
        } else if (paster != null) {
            Object obj = paster.extra;
            if (obj instanceof String) {
                String clipParentId = this.f30111a.h0().getClipParentId((String) obj);
                if (!TextUtils.isEmpty(clipParentId)) {
                    this.f30111a.h0().setTrackIndex(clipParentId, eag.p());
                }
            }
        }
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void d(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2929c6f1", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onTextFontUpdate:" + paster.toString());
        t(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void f(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c003b5c", new Object[]{this, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onRemove:" + paster.toString());
        if (paster.extra instanceof String) {
            this.f30111a.h0().deleteClip((String) paster.extra);
        }
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void i(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548be92c", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onOutlineColorUpdate:" + paster.toString());
        u(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void j(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc39e5c0", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onTextUpdate:" + paster.toString());
        r(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void k(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546ae10b", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onResUpdate:" + paster.toString());
        v(str, paster);
        t(str, paster);
        x(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void l(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f45954", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onMuteUpdate");
        y(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void n(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bacc75", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onTextColorUpdate:" + paster.toString());
        s(str, paster);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void e(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef306e3", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onEndTimeUpdate. startTime:" + paster.startTimeUs + ", endTime:" + paster.endTimeUs);
        if (paster.resType != 3 || !this.b) {
            this.f30111a.h0().setSourceEndTimeUs(str, (paster.endTimeUs - paster.startTimeUs) + 100000);
            return;
        }
        this.f30111a.h0().setClipStartTimeUs(str, paster.startTimeUs - 100000);
        this.f30111a.h0().setClipEndTimeUs(str, paster.endTimeUs + 100000);
    }

    @Override // tb.ltl.b, tb.ltl.a
    public void m(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57db27bc", new Object[]{this, str, paster});
            return;
        }
        odg.d("StickerDifferCBEditorV2", "onStartTimeUpdate. startTime:" + paster.startTimeUs + ", endTime:" + paster.endTimeUs);
        if (paster.resType != 3 || !this.b) {
            this.f30111a.h0().setClipStartTimeUs(str, paster.startTimeUs - 100000);
            this.f30111a.h0().setSourceEndTimeUs(str, (paster.endTimeUs - paster.startTimeUs) + 100000);
            return;
        }
        this.f30111a.h0().setClipStartTimeUs(str, paster.startTimeUs - 100000);
        this.f30111a.h0().setClipEndTimeUs(str, paster.endTimeUs - 100000);
    }

    public final void q(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3d623f", new Object[]{this, str, paster});
        } else if (!TextUtils.isEmpty(str) && this.f30111a.h0() != null) {
            MeEditor h0 = this.f30111a.h0();
            String clipExtra = h0.getClipExtra(str, "targetClipId");
            String clipExtra2 = h0.getClipExtra(str, "resType");
            if (clipExtra == null || !TextUtils.equals(clipExtra2, "resImage")) {
                Transform transform = paster.transform;
                this.f30111a.h0().setScale(str, transform.scale);
                this.f30111a.h0().setRotate(str, (float) (((-transform.rotate) / 180.0f) * 3.141592653589793d));
                this.f30111a.h0().setPosition(str, transform.postionX, transform.postionY);
                return;
            }
            float g = krq.g(h0.getClipExtra(str, "postionX"), 0.0f);
            float g2 = krq.g(h0.getClipExtra(str, "postionY"), 0.0f);
            float g3 = krq.g(h0.getClipExtra(str, "scale"), 0.0f);
            float g4 = krq.g(h0.getClipExtra(str, "rotate"), 0.0f);
            Transform transform2 = paster.transform;
            String clipExtra3 = h0.getClipExtra(str, "targetClipLink");
            double nestedClipDblProp = h0.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "xOffset", (double) vu3.b.GEO_NOT_SUPPORT);
            double nestedClipDblProp2 = h0.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "yOffset", (double) vu3.b.GEO_NOT_SUPPORT);
            double nestedClipDblProp3 = h0.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "xScale", 1.0d);
            double nestedClipDblProp4 = h0.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "yScale", 1.0d);
            float f = transform2.postionX;
            float f2 = transform2.postionY;
            float f3 = transform2.scale;
            h0.setClipExtra(str, "postionX", String.valueOf(f));
            h0.setClipExtra(str, "postionY", String.valueOf(f2));
            h0.setClipExtra(str, "scale", String.valueOf(f3));
            h0.setClipExtra(str, "rotate", String.valueOf(g4));
            double d = f3 / g3;
            double B = B((f - g) + nestedClipDblProp);
            double B2 = B((f2 - g2) + nestedClipDblProp2);
            double B3 = B(nestedClipDblProp3 * d);
            double B4 = B(d * nestedClipDblProp4);
            h0.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "xOffset", B);
            h0.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "yOffset", B2);
            h0.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "xScale", B3);
            h0.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "yScale", B4);
        }
    }
}
