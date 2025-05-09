package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ofv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25366a = false;
    public int b = 0;

    static {
        t2o.a(491782726);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0d00bf3", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a616312", new Object[]{this})).booleanValue();
        }
        return this.f25366a;
    }

    public void c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecdd5c1", new Object[]{this, iContainerDataModel});
            return;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base != null && base.getExt() != null) {
            JSONObject ext = base.getExt();
            this.f25366a = ext.getBooleanValue("unexposedItemsUploadEnable");
            this.b = ext.getIntValue("lastVisibleOffset");
        }
    }
}
