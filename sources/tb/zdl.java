package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zdl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IBizDataModel f32695a;

    static {
        t2o.a(491782260);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[0]);
        } else {
            f32695a = null;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
        } else {
            a();
        }
    }

    public static IBizDataModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBizDataModel) ipChange.ipc$dispatch("a960c511", new Object[0]);
        }
        IBizDataModel iBizDataModel = f32695a;
        a();
        return iBizDataModel;
    }

    public static IBizDataModel d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBizDataModel) ipChange.ipc$dispatch("8b71b33b", new Object[0]);
        }
        return f32695a;
    }

    public static void e(IBizDataModel iBizDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f69703", new Object[]{iBizDataModel});
        } else {
            f32695a = iBizDataModel;
        }
    }
}
