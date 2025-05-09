package com.taobao.infoflow.core.subservice.biz.loopstartstopservice;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.eue;
import tb.fve;
import tb.g5n;
import tb.gnl;
import tb.gsd;
import tb.o4u;
import tb.t2o;
import tb.z51;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MainFeedsLoopStartStopServiceImpl implements IMainFeedsLoopStartStopService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainFeedsLoopStartStopServiceImpl";
    private List<IMainFeedsLoopStartStopService.a> mListener = new CopyOnWriteArrayList();
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private List<gsd> mStartStopDetectorList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IMainFeedsLoopStartStopService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b7652", new Object[]{this, str});
                return;
            }
            MainFeedsLoopStartStopServiceImpl.access$000(MainFeedsLoopStartStopServiceImpl.this).dispatchWindowVisibility(4);
            MainFeedsLoopStartStopServiceImpl.access$200(MainFeedsLoopStartStopServiceImpl.this, str);
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            } else if (MainFeedsLoopStartStopServiceImpl.this.isAllowStart()) {
                MainFeedsLoopStartStopServiceImpl.access$000(MainFeedsLoopStartStopServiceImpl.this).dispatchWindowVisibility(0);
                MainFeedsLoopStartStopServiceImpl.access$100(MainFeedsLoopStartStopServiceImpl.this, str);
            }
        }
    }

    static {
        t2o.a(486539542);
        t2o.a(488636572);
    }

    public static /* synthetic */ IMainFeedsViewService access$000(MainFeedsLoopStartStopServiceImpl mainFeedsLoopStartStopServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("4228a6f1", new Object[]{mainFeedsLoopStartStopServiceImpl});
        }
        return mainFeedsLoopStartStopServiceImpl.mMainFeedsViewService;
    }

    public static /* synthetic */ void access$100(MainFeedsLoopStartStopServiceImpl mainFeedsLoopStartStopServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631c3854", new Object[]{mainFeedsLoopStartStopServiceImpl, str});
        } else {
            mainFeedsLoopStartStopServiceImpl.notifyStart(str);
        }
    }

    public static /* synthetic */ void access$200(MainFeedsLoopStartStopServiceImpl mainFeedsLoopStartStopServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a7b955", new Object[]{mainFeedsLoopStartStopServiceImpl, str});
        } else {
            mainFeedsLoopStartStopServiceImpl.notifyStop(str);
        }
    }

    private List<gsd> createDetectors(cfc cfcVar, IMainFeedsLoopStartStopService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98e09f07", new Object[]{this, cfcVar, aVar});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z51(aVar));
        arrayList.add(new gnl(cfcVar, aVar));
        arrayList.add(new g5n(cfcVar, aVar));
        arrayList.add(new o4u(cfcVar, aVar));
        return arrayList;
    }

    private IMainFeedsLoopStartStopService.a createStartAndStopListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("a8447e40", new Object[]{this});
        }
        return new a();
    }

    private void notifyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a2b46a", new Object[]{this, str});
            return;
        }
        for (IMainFeedsLoopStartStopService.a aVar : this.mListener) {
            try {
                aVar.onStart(str);
            } catch (Throwable th) {
                fve.c(TAG, "notifyStart error： ", th);
            }
        }
    }

    private void notifyStop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0daaf3c", new Object[]{this, str});
            return;
        }
        for (IMainFeedsLoopStartStopService.a aVar : this.mListener) {
            try {
                aVar.a(str);
            } catch (Throwable th) {
                fve.c(TAG, "notifyStart error： ", th);
            }
        }
    }

    private void startDetect(List<gsd> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670b649d", new Object[]{this, list});
            return;
        }
        for (gsd gsdVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gsdVar.b();
            if (eue.b()) {
                fve.k(TAG, "startDetect " + gsdVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    private void stopDetect(List<gsd> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b03603d", new Object[]{this, list});
            return;
        }
        for (gsd gsdVar : list) {
            gsdVar.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            List<gsd> createDetectors = createDetectors(cfcVar, createStartAndStopListener());
            this.mStartStopDetectorList = createDetectors;
            startDetect(createDetectors);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else if (this.mMainFeedsViewService != null) {
            stopDetect(this.mStartStopDetectorList);
            this.mStartStopDetectorList.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService
    public void registerStartStopListener(IMainFeedsLoopStartStopService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133d88d4", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.mListener.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService
    public void unregisterStartStopListener(IMainFeedsLoopStartStopService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac79531b", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.mListener.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService
    public boolean isAllowStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fafee6e", new Object[]{this})).booleanValue();
        }
        List<gsd> list = this.mStartStopDetectorList;
        if (list == null) {
            return true;
        }
        for (gsd gsdVar : list) {
            if (!gsdVar.isAllowStart()) {
                fve.m(TAG, "isAllowStart: 不允许启动的探测器： ".concat(gsdVar.getClass().getName()));
                return false;
            }
        }
        return true;
    }
}
