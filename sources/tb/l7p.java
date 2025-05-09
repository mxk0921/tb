package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f23159a;
    public final IMainFeedsViewService<?> b;
    public final IContainerDataService<?> c;

    static {
        t2o.a(491782423);
    }

    public l7p(cfc cfcVar) {
        this.f23159a = cfcVar;
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.c = (IContainerDataService) cfcVar.a(IContainerDataService.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r8.equals("dressup") == false) goto L_0x002d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "liteDetail"
            java.lang.String r1 = "newDetail"
            r2 = 2
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = tb.l7p.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0022
            java.lang.String r0 = "6aa8830"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            r1[r3] = r8
            java.lang.Object r8 = r5.ipc$dispatch(r0, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1038944751: goto L_0x0041;
                case 1236925087: goto L_0x0038;
                case 1916593938: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r2 = -1
            goto L_0x0049
        L_0x002f:
            java.lang.String r6 = "dressup"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0049
            goto L_0x002d
        L_0x0038:
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003f
            goto L_0x002d
        L_0x003f:
            r2 = 1
            goto L_0x0049
        L_0x0041:
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0048
            goto L_0x002d
        L_0x0048:
            r2 = 0
        L_0x0049:
            switch(r2) {
                case 0: goto L_0x0050;
                case 1: goto L_0x005e;
                case 2: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            return r4
        L_0x004d:
            java.lang.String r0 = "infoFlowPreloadDressUp"
            goto L_0x005e
        L_0x0050:
            com.taobao.infoflow.protocol.subservice.framework.IContainerDataService<?> r8 = r7.c
            if (r8 == 0) goto L_0x005d
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel r8 = r8.getContainerData()
            boolean r8 = tb.gyj.a(r8)
            return r8
        L_0x005d:
            r0 = r1
        L_0x005e:
            boolean r8 = tb.mve.a(r0, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.l7p.a(java.lang.String):boolean");
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7faef27", new Object[]{this, str});
        }
        str.hashCode();
        if (!str.equals("newDetail")) {
            return !str.equals(fnm.TARGET_TYPE_LITE_DETAIL) ? str : yq0.PRELOAD_REQUESTER_BIZ_NAME_LITE;
        }
        return "new_detail";
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fee7e7", new Object[]{this, str});
        } else if (!a(str)) {
            fve.e("DressUpOnLayPagePreLoader", "未开启 预加载, 业务类型targetType= " + str);
        } else {
            PreLoadModel d = d(this.b, str);
            if (d == null) {
                fve.e("DressUpOnLayPagePreLoader", "未构建出预加载模型");
            } else if (d.getItems() != null) {
                d.setBizName(b(str));
                eyj.d(d);
            }
        }
    }

    public final PreLoadModel d(IMainFeedsViewService<?> iMainFeedsViewService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadModel) ipChange.ipc$dispatch("ae9b440d", new Object[]{this, iMainFeedsViewService, str});
        }
        if (iMainFeedsViewService == null) {
            fve.e("DressUpOnLayPagePreLoader", "preparePreLoadModelOnScreen mainFeedsViewService is null");
            return null;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            fve.e("DressUpOnLayPagePreLoader", "range invalid");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (findItemDataByPosition != null) {
                if (h93.a(findItemDataByPosition)) {
                    fve.e("DressUpOnLayPagePreLoader", "预请求跳过缓存卡片:" + findItemDataByPosition.getSectionBizCode());
                } else {
                    JSONObject ext = findItemDataByPosition.getExt();
                    if (ext != null) {
                        ext.put("requestNewDetailFlag", (Object) "1");
                        ext.put("requestNewDetailTime", (Object) Long.valueOf(System.currentTimeMillis()));
                        if (cw6.b()) {
                            new StringBuilder("预加载时间戳：").append(System.currentTimeMillis());
                        }
                    }
                    arrayList.add(findItemDataByPosition);
                }
            }
        }
        return fnm.d(arrayList, -1, str, "InfoFlow");
    }
}
