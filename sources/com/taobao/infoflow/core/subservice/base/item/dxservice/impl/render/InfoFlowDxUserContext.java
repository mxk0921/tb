package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.io.Serializable;
import tb.cfc;
import tb.fl6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InfoFlowDxUserContext extends fl6 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final BaseSectionModel<?> mBaseSectionModel;
    private JSONObject mContext = new JSONObject();
    private final cfc mInfoFlowContext;

    static {
        t2o.a(486539494);
    }

    public InfoFlowDxUserContext(cfc cfcVar, BaseSectionModel<?> baseSectionModel) {
        this.mInfoFlowContext = cfcVar;
        this.mBaseSectionModel = baseSectionModel;
    }

    public static /* synthetic */ Object ipc$super(InfoFlowDxUserContext infoFlowDxUserContext, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/render/InfoFlowDxUserContext");
    }

    public InfoFlowDxUserContext addContext(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowDxUserContext) ipChange.ipc$dispatch("920f3b38", new Object[]{this, str, obj});
        }
        this.mContext.put(str, obj);
        return this;
    }

    public BaseSectionModel<?> getBaseSectionModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("7b1cb86c", new Object[]{this});
        }
        return this.mBaseSectionModel;
    }

    public cfc getInfoFlowContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("b1bd3794", new Object[]{this});
        }
        return this.mInfoFlowContext;
    }

    public int getIntValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b0a4bc", new Object[]{this, str})).intValue();
        }
        return this.mContext.getIntValue(str);
    }

    public Object getObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c26088ec", new Object[]{this, str});
        }
        return this.mContext.get(str);
    }

    public String getStringValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f60d845", new Object[]{this, str});
        }
        return this.mContext.getString(str);
    }
}
