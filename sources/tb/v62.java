package tb;

import android.text.TextUtils;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.java.TemplateTag;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v62 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MeEditor b;
    public TemplateEditor c;
    public Beauty e;
    public String f;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f29803a = new ArrayList();
    public final List<String> d = new ArrayList();
    public boolean g = false;

    static {
        t2o.a(511705332);
    }

    public final float b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7ba4747", new Object[]{this, obj})).floatValue();
        }
        return Math.max(krq.f(obj), 0.01f);
    }

    public void c(MeEditor meEditor, TemplateEditor templateEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f92a55", new Object[]{this, meEditor, templateEditor});
            return;
        }
        this.b = meEditor;
        this.c = templateEditor;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3a5c7f", new Object[]{this});
            return;
        }
        this.g = false;
        ((ArrayList) this.d).clear();
    }

    public void e(Beauty beauty, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82563ea7", new Object[]{this, beauty, list});
            return;
        }
        this.f29803a = list;
        this.e = beauty;
        if (beauty != null) {
            a(beauty);
        }
    }

    public final void f(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691116b5", new Object[]{this, str, new Float(f)});
        } else if (!this.f29803a.isEmpty() || ((ArrayList) this.d).isEmpty()) {
            this.b.getCoreEditor().setProperty(this.f, Beauty.BEAUTY_SHAPE_KEY, str, f);
        } else {
            Iterator it = ((ArrayList) this.d).iterator();
            while (it.hasNext()) {
                this.b.getCoreEditor().setNestedClipDblProp((String) it.next(), Beauty.BEAUTY_SHAPE_KEY, str, f);
            }
        }
    }

    public final void a(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452acbc2", new Object[]{this, beauty});
        } else if (this.b == null) {
            odg.c("BeautyMarvelImpl", "mNewEditor == null");
        } else {
            String str = beauty.mDirPath;
            if (!cg9.l(str)) {
                odg.c("BeautyMarvelImpl", "beauty dirPath not exist " + str);
                return;
            }
            if (!this.g) {
                if (this.f29803a.size() == 1) {
                    this.g = this.b.addExtentionEffectForClip(this.f29803a.get(0), str, Beauty.BEAUTY_SHAPE_KEY, 2L) == 0;
                    this.f = this.f29803a.get(0);
                } else {
                    TemplateEditor templateEditor = this.c;
                    if (templateEditor != null) {
                        for (TemplateTag templateTag : templateEditor.getAllTemplateTags()) {
                            if (TextUtils.equals("mediasPlaceHolder", templateTag.type)) {
                                ((ArrayList) this.d).add(templateTag.target);
                                String clipLinkProject = this.b.getClipLinkProject(templateTag.target);
                                String clipLinkTargetClip = this.b.getClipLinkTargetClip(templateTag.target);
                                this.b.selectProject(clipLinkProject);
                                this.g = this.b.addExtentionEffectForClip(clipLinkTargetClip, str, Beauty.BEAUTY_SHAPE_KEY, 2L) == 0;
                                this.b.selectProject("");
                            }
                        }
                    }
                }
            }
            if (!this.g) {
                odg.c("BeautyMarvelImpl", "beauty add fail ");
                return;
            }
            int i = this.e.mDirtyType;
            if (i == 3) {
                for (Integer num : beauty.mBeautyValues.keySet()) {
                    int intValue = num.intValue();
                    float b = b(beauty.mBeautyValues.get(num));
                    odg.d("BeautyMarvelImpl", "beauty key = " + intValue + ",value = " + b);
                    f("BeautyFilterModule_" + intValue, b);
                }
                for (Integer num2 : beauty.mShapeValues.keySet()) {
                    String str2 = "BeautyShapeModule_" + num2.intValue();
                    float b2 = b(beauty.mShapeValues.get(num2));
                    odg.d("BeautyMarvelImpl", "shape key = " + str2 + ",value = " + b2);
                    f(str2, b(Float.valueOf(b2)));
                }
            } else if (i == 1) {
                String str3 = "BeautyFilterModule_" + this.e.mSingleKey;
                Float f = beauty.mBeautyValues.get(Integer.valueOf(this.e.mSingleKey));
                odg.d("BeautyMarvelImpl", "beauty key = " + str3 + ",value = " + f.floatValue());
                f(str3, b(f));
            } else if (i == 2) {
                String str4 = "BeautyShapeModule_" + this.e.mSingleKey;
                Float f2 = beauty.mShapeValues.get(Integer.valueOf(this.e.mSingleKey));
                odg.d("BeautyMarvelImpl", "beautyShape key = " + str4 + ",value = " + f2.floatValue());
                f(str4, b(f2));
            }
        }
    }
}
