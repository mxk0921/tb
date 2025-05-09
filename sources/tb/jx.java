package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.pop.protocol.model.section.BasePopItemModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class jx extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(jx jxVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/AbsPopEventHandler");
    }

    public void a(BasePopSectionModel basePopSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8df6efa", new Object[]{this, basePopSectionModel, jSONObject});
        } else if (basePopSectionModel != null || jSONObject != null) {
            vhm.d(basePopSectionModel, jSONObject, null);
        }
    }

    public JSONObject b(int i, BasePopSectionModel basePopSectionModel) {
        BasePopItemModel item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b8fe0cd", new Object[]{this, new Integer(i), basePopSectionModel});
        }
        if (!(basePopSectionModel == null || (item = basePopSectionModel.getItem()) == null || item.isEmpty())) {
            Object obj = item.get(String.valueOf(i));
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
        }
        return null;
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
