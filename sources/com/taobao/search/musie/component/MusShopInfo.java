package com.taobao.search.musie.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.mmd.uikit.shopinfo.ShopInfoItemBean;
import com.taobao.search.sf.RpxConfigVM;
import java.util.ArrayList;
import java.util.List;
import tb.oxb;
import tb.p1p;
import tb.qrl;
import tb.t2o;
import tb.tqp;
import tb.vaj;
import tb.wop;
import tb.xop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MusShopInfo extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_DATA = "data";
    private static final String ATTR_ITEM_LIST = "itemList";
    private static final String ATTR_SIZE_STYLE = "sizeStyle";
    private static final String ATTR_TB2024 = "tb2024";
    private static final String EXTRA_BACKGROUND = "background";
    private static final String EXTRA_DRAW_LIST = "drawList";
    private boolean layout = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11580a;
        public final List<ShopInfoItemBean> b;

        static {
            t2o.a(815792686);
        }

        public a(int i, List<ShopInfoItemBean> list) {
            this.f11580a = i;
            this.b = list;
        }
    }

    static {
        t2o.a(815792685);
    }

    public MusShopInfo(int i) {
        super(i);
    }

    private tqp assembleSubDraw(String str, TextPaint textPaint, int i, float f, float f2, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tqp) ipChange.ipc$dispatch("6e74af27", new Object[]{this, str, textPaint, new Integer(i), new Float(f), new Float(f2), new Boolean(z), new Integer(i2)});
        }
        tqp tqpVar = new tqp(textPaint, false);
        tqpVar.f(str, f, i, f2, z);
        tqpVar.h(i2, 0, 0, 0);
        return tqpVar;
    }

    private float calculateBaseline(TextPaint textPaint, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e185561", new Object[]{this, textPaint, new Integer(i)})).floatValue();
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f = fontMetrics.descent;
        float f2 = f - fontMetrics.ascent;
        float f3 = i;
        if (f2 > f3) {
            return f3 - f;
        }
        return (f3 - ((f3 - f2) / 2.0f)) - f;
    }

    public static /* synthetic */ Object ipc$super(MusShopInfo musShopInfo, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -136526582) {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == 1084303291) {
            super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/component/MusShopInfo");
        }
    }

    private boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        Context uIContext = getInstance().getUIContext();
        if (!(uIContext instanceof oxb) || !((oxb) uIContext).E1()) {
            return false;
        }
        return true;
    }

    private float px2Rpx(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6143399", new Object[]{this, new Float(f)})).floatValue();
        }
        return RpxConfigVM.Companion.f((Activity) getInstance().getUIContext(), p1p.d(f));
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.DRAWABLE;
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        xop xopVar = (xop) obj;
        xopVar.q((List) getExtra(EXTRA_DRAW_LIST));
        xopVar.r((wop) getExtra("background"));
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        ((xop) obj).p();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        xop xopVar = (xop) obj;
        if (xopVar == null) {
            return;
        }
        if (TextUtils.equals(str, EXTRA_DRAW_LIST)) {
            xopVar.p();
            xopVar.q((List) obj2);
        } else if (TextUtils.equals(str, "background")) {
            xopVar.r((wop) obj2);
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // tb.hvu
    public xop onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xop) ipChange.ipc$dispatch("3aaf7af6", new Object[]{this, context}) : new xop();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.layout = true;
        a aVar = (a) getAttribute("itemList");
        Boolean bool = (Boolean) getAttribute("tb2024");
        if (aVar != null) {
            updateDrawList(aVar.b, aVar.f11580a, i3 - i, i4 - i2, bool != null && bool.booleanValue(), (String) getAttribute(ATTR_SIZE_STYLE));
        }
    }

    @MUSNodeProp(name = "data")
    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            setExtra(EXTRA_DRAW_LIST, null);
            setAttribute("itemList", null);
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("infoList");
            boolean booleanValue = jSONObject.getBooleanValue("tb2024");
            setAttribute("tb2024", Boolean.valueOf(booleanValue));
            String string = jSONObject.getString(ATTR_SIZE_STYLE);
            setAttribute(ATTR_SIZE_STYLE, string);
            if (jSONArray == null || jSONArray.isEmpty()) {
                setExtra(EXTRA_DRAW_LIST, null);
                setAttribute("itemList", null);
                return;
            }
            if (isDarkMode()) {
                jSONObject.put(vaj.KEY_BG_COLOR, "#333333");
                jSONObject.remove("borderColor");
            }
            if (!TextUtils.isEmpty(jSONObject.getString(vaj.KEY_BG_COLOR))) {
                setExtra("background", wop.d(jSONObject));
            } else {
                setExtra("background", null);
            }
            int b = qrl.b(jSONObject.getString("guideColor"), xop.h);
            if (isDarkMode()) {
                b = xop.i;
            }
            ArrayList arrayList = new ArrayList(jSONArray.size());
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new ShopInfoItemBean(jSONArray.getJSONObject(i)));
            }
            setAttribute("itemList", new a(b, arrayList));
            if (this.layout) {
                updateDrawList(arrayList, b, getLayoutWidth(), getLayoutHeight(), booleanValue, string);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateDrawList(java.util.List<com.taobao.search.mmd.uikit.shopinfo.ShopInfoItemBean> r29, int r30, int r31, int r32, boolean r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.component.MusShopInfo.updateDrawList(java.util.List, int, int, int, boolean, java.lang.String):void");
    }
}
