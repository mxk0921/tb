package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wfm implements IMainFeedsLoopStartStopService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f30668a;

    static {
        t2o.a(491782603);
        t2o.a(488636573);
    }

    public wfm(e3b e3bVar) {
        this.f30668a = e3bVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0b7652", new Object[]{this, str});
        } else {
            this.f30668a.j().p(b(str));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
    public void onStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
        } else {
            this.f30668a.j().o(b(str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int b(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4061f808", new Object[]{this, str})).intValue();
        }
        switch (str.hashCode()) {
            case -1633761750:
                if (str.equals(IMainFeedsLoopStartStopService.a.MUTI_CLASS_TAB_SWITCH)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1538563764:
                if (str.equals(IMainFeedsLoopStartStopService.a.SECOND_FLOOR_SWITCH)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1289658019:
                if (str.equals(IMainFeedsLoopStartStopService.a.PAGE_SWITCH)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1502363829:
                if (str.equals(IMainFeedsLoopStartStopService.a.APP_SWITCH)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1607966505:
                if (str.equals(IMainFeedsLoopStartStopService.a.TAB_SWITCH)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 4;
        }
        if (c != 1) {
            return c != 2 ? 0 : 2;
        }
        return 3;
    }
}
