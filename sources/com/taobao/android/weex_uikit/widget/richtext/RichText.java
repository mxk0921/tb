package com.taobao.android.weex_uikit.widget.richtext;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.text.Text;
import com.taobao.media.MediaConstant;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import tb.bgo;
import tb.dwh;
import tb.j02;
import tb.mmt;
import tb.nre;
import tb.ny1;
import tb.t2o;
import tb.wvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RichText extends Text {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_RELEASE_SPAN = "releaseImageSpan";
    private static final String IMAGE = "image";
    private static final String KEY_ATTR = "attr";
    private static final String KEY_CHILDREN = "children";
    private static final String KEY_STYLE = "style";
    private static final String KEY_TYPE = "type";
    private static final String LINK = "a";
    private static final String SPAN = "span";
    private List<nre> imageSpans = new ArrayList(3);
    private List<ClickableSpan> clickableSpans = new ArrayList(3);
    private bgo rootText = new bgo(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends ny1<RichText> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710206);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/RichText$NodeHolder");
        }

        /* renamed from: e */
        public RichText d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RichText) ipChange.ipc$dispatch("d8c82add", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            RichText richText = new RichText(i);
            richText.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                richText.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                richText.updateAttrs(mUSProps2);
            }
            return richText;
        }

        @Override // tb.vtf
        public String getMethods() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
            }
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    static {
        t2o.a(986710205);
    }

    public RichText(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(RichText richText, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 545542899:
                return new Boolean(super.onUpdateStyle((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            case 1084303291:
                super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
                return null;
            case 2146603619:
                return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/RichText");
        }
    }

    private void mountImageSpans(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf858be8", new Object[]{this, mUSDKInstance});
        } else if (mUSDKInstance.getImageAdapter() != null) {
            for (nre nreVar : this.imageSpans) {
                String b = nreVar.b();
                if (!TextUtils.isEmpty(b)) {
                    mUSDKInstance.getImageAdapter().b(mUSDKInstance.getUIContext(), b, nreVar, MUSImageQuality.AUTO);
                }
            }
        }
    }

    private void unmountImageSpans(MUSDKInstance mUSDKInstance, List<nre> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c8f2", new Object[]{this, mUSDKInstance, list});
        } else if (mUSDKInstance.getImageAdapter() != null) {
            for (nre nreVar : list) {
                Drawable a2 = nreVar.a();
                if (a2 != null) {
                    mUSDKInstance.getImageAdapter().c(a2, nreVar);
                }
                mUSDKInstance.getImageAdapter().a(nreVar.b(), nreVar);
            }
        }
    }

    public void addClickSpan(ClickableSpan clickableSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527e8fbb", new Object[]{this, clickableSpan});
        } else {
            this.clickableSpans.add(clickableSpan);
        }
    }

    public void addFontFamily(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c808fa5", new Object[]{this, str});
        }
    }

    public void addImageSpan(nre nreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4792937f", new Object[]{this, nreVar});
        } else {
            this.imageSpans.add(nreVar);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        mountImageSpans(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        unmountImageSpans(mUSDKInstance, this.imageSpans);
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        List<nre> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        if (TextUtils.equals(str, EXTRA_RELEASE_SPAN) && getInstance() != null && (list = (List) obj2) != null) {
            unmountImageSpans(getInstance(), list);
            list.clear();
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text
    public void refreshText(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8445271", new Object[]{this, uINode, obj, obj2});
        } else {
            onMount(getInstance(), obj);
        }
    }

    private void setValue(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06ea85e", new Object[]{this, jSONArray});
            return;
        }
        setExtra(EXTRA_RELEASE_SPAN, new ArrayList(this.imageSpans));
        this.imageSpans.clear();
        this.clickableSpans.clear();
        setAttribute("value", "");
        if (jSONArray == null) {
            setExtra(Constants.Name.ARIA_LABEL, null);
            dwh.v("[RichText] content is invalid or null");
            return;
        }
        this.rootText.d();
        traverseContent(this.rootText, jSONArray);
        SpannableString spannableString = new SpannableString(this.rootText.b());
        this.rootText.q(spannableString, 0);
        setAttribute("value", spannableString);
        setExtra(Constants.Name.ARIA_LABEL, spannableString.toString());
        setAttribute(mmt.ATTR_IMAGE_SPAN, this.imageSpans.toArray(new ImageSpan[this.imageSpans.size()]));
        setAttribute(mmt.ATTR_CLICK_SPAN, this.clickableSpans.toArray(new ClickableSpan[this.clickableSpans.size()]));
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (!TextUtils.equals(str, "value")) {
            return super.onUpdateAttr(uINode, str, mUSValue);
        }
        setValue((JSONArray) mUSValue.getValue());
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        try {
            if (this.rootText.E(str, mUSValue)) {
                return true;
            }
            return super.onUpdateStyle(this, str, mUSValue);
        } catch (Exception e) {
            wvh.a().b("RichText.onUpdateStyle", e);
            StringBuilder sb = new StringBuilder("onUpdateStyle Error:class:");
            sb.append(getClass().getSimpleName());
            sb.append(", prop: ");
            sb.append(str);
            sb.append(", value: ");
            if (mUSValue == null) {
                str2 = "";
            } else {
                str2 = mUSValue.toShortString();
            }
            sb.append(str2);
            dwh.g("RichText", sb.toString(), e);
            return true;
        }
    }

    private void traverseContent(j02 j02Var, JSONArray jSONArray) {
        j02 createChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff33e96", new Object[]{this, j02Var, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!(jSONObject == null || (createChild = createChild(jSONObject)) == null)) {
                    j02Var.a(createChild);
                    createChild.F(jSONObject.getJSONObject("style"));
                    createChild.D(jSONObject.getJSONObject("attr"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("children");
                    if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                        if (createChild.c()) {
                            traverseContent(createChild, jSONArray2);
                        } else {
                            dwh.v("[RichText] tag " + createChild.getClass().getSimpleName() + " can not have children");
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r6.equals("span") == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.j02 createChild(com.alibaba.fastjson.JSONObject r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.richtext.RichText.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "89ef85ed"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            tb.j02 r6 = (tb.j02) r6
            return r6
        L_0x0018:
            java.lang.String r3 = "type"
            java.lang.String r6 = r6.getString(r3)
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 97: goto L_0x0041;
                case 3536714: goto L_0x0037;
                case 100313435: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "image"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0035
            goto L_0x002a
        L_0x0035:
            r0 = 2
            goto L_0x004b
        L_0x0037:
            java.lang.String r1 = "span"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x002a
        L_0x0041:
            java.lang.String r0 = "a"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x002a
        L_0x004a:
            r0 = 0
        L_0x004b:
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0056;
                case 2: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            r6 = 0
            goto L_0x0061
        L_0x0050:
            tb.bne r6 = new tb.bne
            r6.<init>(r5)
            goto L_0x0061
        L_0x0056:
            tb.yaq r6 = new tb.yaq
            r6.<init>(r5)
            goto L_0x0061
        L_0x005c:
            tb.zb r6 = new tb.zb
            r6.<init>(r5)
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.richtext.RichText.createChild(com.alibaba.fastjson.JSONObject):tb.j02");
    }
}
