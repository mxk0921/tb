package com.taobao.message.notification.banner.dx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import tb.ckf;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DXTemplateVO;", "", "mDXTemplateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "mData", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;Lcom/alibaba/fastjson/JSONObject;)V", "getMDXTemplateItem", "()Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "getMData", "()Lcom/alibaba/fastjson/JSONObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DXTemplateVO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DXTemplateItem mDXTemplateItem;
    private final JSONObject mData;

    static {
        t2o.a(610271250);
    }

    public DXTemplateVO(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        ckf.h(dXTemplateItem, "mDXTemplateItem");
        ckf.h(jSONObject, "mData");
        this.mDXTemplateItem = dXTemplateItem;
        this.mData = jSONObject;
    }

    public static /* synthetic */ DXTemplateVO copy$default(DXTemplateVO dXTemplateVO, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateVO) ipChange.ipc$dispatch("7a5a13e5", new Object[]{dXTemplateVO, dXTemplateItem, jSONObject, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            dXTemplateItem = dXTemplateVO.mDXTemplateItem;
        }
        if ((i & 2) != 0) {
            jSONObject = dXTemplateVO.mData;
        }
        return dXTemplateVO.copy(dXTemplateItem, jSONObject);
    }

    public final DXTemplateItem component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("932a7e44", new Object[]{this});
        }
        return this.mDXTemplateItem;
    }

    public final JSONObject component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5d66cffc", new Object[]{this});
        }
        return this.mData;
    }

    public final DXTemplateVO copy(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateVO) ipChange.ipc$dispatch("7a8d8412", new Object[]{this, dXTemplateItem, jSONObject});
        }
        ckf.h(dXTemplateItem, "mDXTemplateItem");
        ckf.h(jSONObject, "mData");
        return new DXTemplateVO(dXTemplateItem, jSONObject);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof DXTemplateVO) {
                DXTemplateVO dXTemplateVO = (DXTemplateVO) obj;
                if (!ckf.b(this.mDXTemplateItem, dXTemplateVO.mDXTemplateItem) || !ckf.b(this.mData, dXTemplateVO.mData)) {
                }
            }
            return false;
        }
        return true;
    }

    public final DXTemplateItem getMDXTemplateItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1fa444c0", new Object[]{this});
        }
        return this.mDXTemplateItem;
    }

    public final JSONObject getMData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5d583328", new Object[]{this});
        }
        return this.mData;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        DXTemplateItem dXTemplateItem = this.mDXTemplateItem;
        if (dXTemplateItem != null) {
            i = dXTemplateItem.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        JSONObject jSONObject = this.mData;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXTemplateVO(mDXTemplateItem=" + this.mDXTemplateItem + ", mData=" + this.mData + f7l.BRACKET_END_STR;
    }
}
