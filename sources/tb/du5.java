package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class du5 extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXDETAILADAPTIVELINEARLAYOUT_ENABLECOMPLEMENT = 8723894412244725131L;
    public static final long DX_EVENT_ID;
    public static final long VIEW_IDENTITY;
    public int h = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262674);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new du5();
        }
    }

    static {
        t2o.a(912262673);
        long a2 = k06.a("DetailAdaptiveLinearLayout");
        DX_EVENT_ID = a2;
        VIEW_IDENTITY = a2;
    }

    public static /* synthetic */ Object ipc$super(du5 du5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 112799177:
                super.measureHorizontal(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailAdaptiveLinearLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.c, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new du5();
    }

    @Override // com.taobao.android.dinamicx.widget.c, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXDETAILADAPTIVELINEARLAYOUT_ENABLECOMPLEMENT) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.c, com.taobao.android.dinamicx.widget.k
    public void measureHorizontal(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92dc9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.measureHorizontal(i, i2);
        if (this.h == 1) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            ArrayList arrayList = new ArrayList();
            for (DXWidgetNode dXWidgetNode : getChildren()) {
                int measuredWidth = dXWidgetNode.getMeasuredWidth() + paddingLeft;
                if (measuredWidth > getMeasuredWidth()) {
                    dXWidgetNode.setVisibility(2);
                    arrayList.add(Boolean.FALSE);
                } else {
                    dXWidgetNode.setVisibility(0);
                    arrayList.add(Boolean.TRUE);
                    paddingLeft = measuredWidth;
                }
            }
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            v(dXRuntimeContext.h(), arrayList, dXRuntimeContext.i());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.c, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof du5)) {
            super.onClone(dXWidgetNode, z);
            this.h = ((du5) dXWidgetNode).h;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.c, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXDETAILADAPTIVELINEARLAYOUT_ENABLECOMPLEMENT) {
            this.h = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public final String w(String str, List<Boolean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef938db4", new Object[]{this, str, list});
        }
        StringBuffer stringBuffer = new StringBuffer();
        String[] split = str.split(";");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).booleanValue()) {
                if (!TextUtils.isEmpty(stringBuffer)) {
                    stringBuffer.append(";");
                }
                stringBuffer.append(split[i]);
            }
        }
        return stringBuffer.toString();
    }

    public final void v(Context context, List<Boolean> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65b7058", new Object[]{this, context, list, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events").getJSONArray("exposureItem").getJSONObject(0).getJSONObject("fields").getJSONObject("args");
            jSONObject2.put("itemFeature", (Object) w(jSONObject2.getString("itemFeature"), list));
            jSONObject2.put("itemFeatureSize", (Object) String.valueOf(list.size()));
            jSONObject2.put("itemFeatureBizType", (Object) w(jSONObject2.getString("itemFeatureBizType"), list));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("page", (Object) "Page_Detail");
            jSONObject3.put("eventId", (Object) 2201);
            jSONObject3.put("arg1", (Object) "Page_Detail_Show-ItemFeature-Adjusted");
            jSONObject3.put("args", (Object) jSONObject2);
            q84.f(context, new rc7("userTrack", jSONObject3, new RuntimeAbilityParam[0]));
        } catch (Throwable th) {
            tgh.c("DXDetailAdaptiveLinearLayoutWidgetNode", "exposureItem 商品背书额外曝光", th);
        }
    }
}
