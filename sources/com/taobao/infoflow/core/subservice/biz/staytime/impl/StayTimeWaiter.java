package com.taobao.infoflow.core.subservice.biz.staytime.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.io.Serializable;
import tb.arb;
import tb.cfc;
import tb.fve;
import tb.t2o;
import tb.uve;
import tb.vve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StayTimeWaiter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Long f10666a;
    public StayTimeModel b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StayTimeModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long endTime;
        private int enterFirstPos;
        private int leaveFirstPos;
        private int leaveLastPos;
        private int maxScrollPos;
        private long startTime;

        static {
            t2o.a(486539608);
        }

        private StayTimeModel() {
        }

        public static /* synthetic */ long access$100(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cccabc08", new Object[]{stayTimeModel})).longValue();
            }
            return stayTimeModel.startTime;
        }

        public static /* synthetic */ long access$102(StayTimeModel stayTimeModel, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3c6ef362", new Object[]{stayTimeModel, new Long(j)})).longValue();
            }
            stayTimeModel.startTime = j;
            return j;
        }

        public static /* synthetic */ int access$200(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("92f544c8", new Object[]{stayTimeModel})).intValue();
            }
            return stayTimeModel.enterFirstPos;
        }

        public static /* synthetic */ int access$202(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b957eff", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.enterFirstPos = i;
            return i;
        }

        public static /* synthetic */ int access$300(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("591fcd89", new Object[]{stayTimeModel})).intValue();
            }
            return stayTimeModel.leaveFirstPos;
        }

        public static /* synthetic */ int access$302(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3abc0e5e", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.leaveFirstPos = i;
            return i;
        }

        public static /* synthetic */ int access$400(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1f4a564a", new Object[]{stayTimeModel})).intValue();
            }
            return stayTimeModel.leaveLastPos;
        }

        public static /* synthetic */ int access$402(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("39e29dbd", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.leaveLastPos = i;
            return i;
        }

        public static /* synthetic */ int access$500(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e574df0b", new Object[]{stayTimeModel})).intValue();
            }
            return stayTimeModel.maxScrollPos;
        }

        public static /* synthetic */ int access$502(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("39092d1c", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.maxScrollPos = i;
            return i;
        }

        public static /* synthetic */ long access$600(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ab9f67cd", new Object[]{stayTimeModel})).longValue();
            }
            return stayTimeModel.endTime;
        }

        public static /* synthetic */ long access$602(StayTimeModel stayTimeModel, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("382fc03d", new Object[]{stayTimeModel, new Long(j)})).longValue();
            }
            stayTimeModel.endTime = j;
            return j;
        }
    }

    static {
        t2o.a(486539606);
    }

    public static int[] d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("77a1b3e3", new Object[]{cfcVar});
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return null;
        }
        return iMainFeedsViewService.getVisiblePositionRange();
    }

    public final JSONObject c(cfc cfcVar) {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a3901bd7", new Object[]{this, cfcVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null) {
            return null;
        }
        return base.getStayTimeParams();
    }

    public void e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedcbaa5", new Object[]{this, l});
        } else {
            this.f10666a = l;
        }
    }

    public void a(cfc cfcVar, long j, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86d8c7a", new Object[]{this, cfcVar, new Long(j), iArr});
            return;
        }
        StayTimeModel stayTimeModel = new StayTimeModel();
        this.b = stayTimeModel;
        StayTimeModel.access$102(stayTimeModel, j);
        if (iArr != null) {
            StayTimeModel.access$202(this.b, iArr[0]);
            StayTimeModel.access$302(this.b, iArr[0]);
            StayTimeModel.access$402(this.b, iArr[1]);
            StayTimeModel.access$502(this.b, iArr[1]);
        }
    }

    public void b(cfc cfcVar, long j, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66d719", new Object[]{this, cfcVar, new Long(j), iArr});
            return;
        }
        arb containerType = cfcVar.getContainerType();
        String a2 = containerType.a();
        String containerId = containerType.getContainerId();
        JSONObject c = c(cfcVar);
        StayTimeModel stayTimeModel = this.b;
        if (stayTimeModel == null || StayTimeModel.access$100(stayTimeModel) == 0) {
            fve.e("StayTimeWaiter", "it has no enterTime with " + a2 + "_" + containerId + ", so this commitLeave is abandon.");
            return;
        }
        if (j > 0) {
            StayTimeModel.access$602(this.b, j);
        } else {
            StayTimeModel.access$602(this.b, System.nanoTime());
        }
        long access$600 = ((StayTimeModel.access$600(this.b) - StayTimeModel.access$100(this.b)) + 500000) / 1000000;
        Long l = this.f10666a;
        if (l == null || access$600 >= l.longValue()) {
            if (c == null) {
                c = new JSONObject();
            }
            if (iArr != null) {
                StayTimeModel.access$302(this.b, iArr[0]);
                StayTimeModel.access$402(this.b, iArr[1]);
            }
            StayTimeModel stayTimeModel2 = this.b;
            StayTimeModel.access$502(stayTimeModel2, Math.max(StayTimeModel.access$500(stayTimeModel2), StayTimeModel.access$400(this.b)));
            c.put("enterFirstPos", (Object) Integer.valueOf(StayTimeModel.access$200(this.b)));
            c.put("leaveFirstPos", (Object) Integer.valueOf(StayTimeModel.access$300(this.b)));
            c.put("leaveLastPos", (Object) Integer.valueOf(StayTimeModel.access$400(this.b)));
            c.put("maxScrollPos", (Object) Integer.valueOf(StayTimeModel.access$500(this.b)));
            uve.a(a2, 2002, containerId, null, String.valueOf(access$600), vve.x(a2, c));
            this.b = null;
        }
    }
}
