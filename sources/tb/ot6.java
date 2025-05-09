package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ot6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xs6 f25635a;

    static {
        t2o.a(487587862);
    }

    public static int c(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68315fc9", new Object[]{str, list})).intValue();
        }
        return xli.d(str, list);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb7e146", new Object[0])).booleanValue();
        }
        return o78.s(rj7.a());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public AwesomeGetContainerInnerData a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("f161c4cf", new Object[]{this, awesomeGetContainerData});
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.getDeltaData() == null) {
            return null;
        }
        AwesomeGetContainerInnerData clone = awesomeGetContainerData.getDelta().clone();
        for (SectionModel sectionModel : awesomeGetContainerData.getDeltaData()) {
            if (!TextUtils.equals(sectionModel.getString("invalidType"), "never")) {
                clone.getSections().remove(sectionModel);
            }
        }
        return clone;
    }

    public int b(SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9416c16", new Object[]{this, sectionModel, list})).intValue();
        }
        if (sectionModel == null || list == null || list.isEmpty()) {
            return -1;
        }
        int indexOf = list.indexOf(sectionModel);
        return indexOf >= 0 ? indexOf : c(sectionModel.getString("sectionBizCode"), list);
    }

    public final String d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6029076e", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "baseRefresh";
        }
        return "deltaRefresh";
    }

    public void e(xs6 xs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86f7ff5", new Object[]{this, xs6Var});
        } else {
            this.f25635a = xs6Var;
        }
    }

    public List<SectionModel> g(String str, AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5bc58a8", new Object[]{this, str, awesomeGetContainerData, awesomeGetContainerData2});
        }
        return new xli().l(this.f25635a, str, awesomeGetContainerData, awesomeGetContainerData2);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public void h(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4424869c", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2});
        } else if (awesomeGetContainerData != null && awesomeGetContainerData2 != null) {
            String d = d(awesomeGetContainerData2.getBase() != null && awesomeGetContainerData2.getBase().isDataChange() && awesomeGetContainerData2.getPageNum() == 0);
            List<SectionModel> deltaData = awesomeGetContainerData.getDeltaData();
            List<SectionModel> deltaData2 = awesomeGetContainerData2.getDeltaData();
            ArrayList arrayList = new ArrayList();
            if (TextUtils.equals(d, "deltaRefresh")) {
                arrayList.add("baseRefresh");
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(d, "baseRefresh")) {
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(d, "pageExit")) {
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(d, "appExit")) {
                arrayList.add("never");
            } else {
                TextUtils.equals(d, "never");
            }
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty() && deltaData != null) {
                for (SectionModel sectionModel : deltaData) {
                    if (arrayList.contains(sectionModel.getString("invalidType"))) {
                        arrayList2.add(sectionModel);
                    }
                }
            }
            if (deltaData2 != null) {
                for (int i = 0; i < deltaData2.size(); i++) {
                    SectionModel sectionModel2 = deltaData2.get(i);
                    if (Boolean.parseBoolean(sectionModel2.getString("keep"))) {
                        int b = b(sectionModel2, deltaData);
                        if (b >= 0) {
                            SectionModel sectionModel3 = deltaData.get(b);
                            if (b(sectionModel3, arrayList2) < 0) {
                                arrayList2.add(sectionModel3);
                            }
                        }
                    } else {
                        int b2 = b(sectionModel2, arrayList2);
                        if (b2 >= 0) {
                            arrayList2.remove(b2);
                        }
                        arrayList2.add(sectionModel2);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                awesomeGetContainerData2.setDelta(null);
                return;
            }
            if (awesomeGetContainerData2.getDelta() == null) {
                awesomeGetContainerData2.setDelta(awesomeGetContainerData.getDelta().clone());
            }
            awesomeGetContainerData2.getDelta().setSections(arrayList2);
        }
    }
}
