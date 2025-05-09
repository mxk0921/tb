package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.ut.mini.UTTracker;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class o3v extends n3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final t4e f;

    static {
        t2o.a(141557770);
    }

    public o3v(t4e t4eVar) {
        ckf.g(t4eVar, DataReceiveMonitor.CB_LISTENER);
        this.f = t4eVar;
    }

    public static /* synthetic */ Object ipc$super(o3v o3vVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1940644637:
                super.updatePageUtparam(objArr[0], (String) objArr[1]);
                return null;
            case -1921720483:
                super.updatePageProperties((UTTracker) objArr[0], objArr[1], (Map) objArr[2]);
                return null;
            case -1811525386:
                super.endEvent((v0v) objArr[0]);
                return null;
            case -1693072052:
                super.updateNextPageProperties((UTTracker) objArr[0], (Map) objArr[1]);
                return null;
            case -1491668773:
                super.pageAppear((UTTracker) objArr[0], objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -920181391:
                super.updateScene((String) objArr[0], (Map) objArr[1]);
                return null;
            case -489493404:
                super.updateEvent((v0v) objArr[0]);
                return null;
            case -464006057:
                super.addExposureViewToCommit((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (Map) objArr[4]);
                return null;
            case -79852207:
                super.beginScene((String) objArr[0], (Map) objArr[1]);
                return null;
            case 210843395:
                super.updatePagePropertiesEnd((UTTracker) objArr[0], objArr[1]);
                return null;
            case 321029302:
                super.send((UTTracker) objArr[0], (Map) objArr[1]);
                return null;
            case 553274522:
                super.updatePageName((UTTracker) objArr[0], objArr[1], (String) objArr[2]);
                return null;
            case 692154911:
                super.pageDisAppear((UTTracker) objArr[0], objArr[1]);
                return null;
            case 818830612:
                super.updateNextPageUtparam((String) objArr[0]);
                return null;
            case 878584900:
                super.beginEvent((v0v) objArr[0]);
                return null;
            case 1282808235:
                super.viewBecomeVisible((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 1601165657:
                super.pageDisAppearEnd((UTTracker) objArr[0], objArr[1], (Map) objArr[2]);
                return null;
            case 1613428460:
                super.sendEvent((Map) objArr[0]);
                return null;
            case 2065579779:
                super.endScene((String) objArr[0], (Map) objArr[1]);
                return null;
            case 2136228042:
                super.updateEventPageName((v0v) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/uttracker/UTTrackerListenerImpl");
        }
    }

    @Override // tb.n3v
    public void addExposureViewToCommit(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e457d457", new Object[]{this, str, str2, str3, str4, map});
        } else {
            super.addExposureViewToCommit(str, str2, str3, str4, map);
        }
    }

    @Override // tb.n3v
    public void beginEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
        } else {
            super.beginEvent(v0vVar);
        }
    }

    @Override // tb.n3v
    public void beginScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
        } else {
            super.beginScene(str, map);
        }
    }

    @Override // tb.n3v
    public void endEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
        } else {
            super.endEvent(v0vVar);
        }
    }

    @Override // tb.n3v
    public void endScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
        } else {
            super.endScene(str, map);
        }
    }

    @Override // tb.n3v
    public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
        } else {
            super.pageAppear(uTTracker, obj, str, z);
        }
    }

    @Override // tb.n3v
    public void pageDisAppear(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
            return;
        }
        super.pageDisAppear(uTTracker, obj);
        this.e.set(true);
    }

    @Override // tb.n3v
    public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
        } else {
            super.pageDisAppearEnd(uTTracker, obj, map);
        }
    }

    @Override // tb.n3v
    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
            return;
        }
        super.send(uTTracker, map);
        this.f.b(uTTracker, map);
    }

    @Override // tb.n3v
    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
        } else {
            super.sendEvent(map);
        }
    }

    @Override // tb.n3v
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
        }
        return "ability_ut_tracker";
    }

    @Override // tb.n3v
    public void updateEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
        } else {
            super.updateEvent(v0vVar);
        }
    }

    @Override // tb.n3v
    public void updateEventPageName(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
        } else {
            super.updateEventPageName(v0vVar);
        }
    }

    @Override // tb.n3v
    public void updateNextPageProperties(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b15c54c", new Object[]{this, uTTracker, map});
        } else {
            super.updateNextPageProperties(uTTracker, map);
        }
    }

    @Override // tb.n3v
    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
        } else {
            super.updateNextPageUtparam(str);
        }
    }

    @Override // tb.n3v
    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            return;
        }
        super.updatePageName(uTTracker, obj, str);
        if (this.e.compareAndSet(true, false)) {
            this.f.a(uTTracker, obj, str);
        }
    }

    @Override // tb.n3v
    public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
        } else {
            super.updatePageProperties(uTTracker, obj, map);
        }
    }

    @Override // tb.n3v
    public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
        } else {
            super.updatePagePropertiesEnd(uTTracker, obj);
        }
    }

    @Override // tb.n3v
    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
        } else {
            super.updatePageUtparam(obj, str);
        }
    }

    @Override // tb.n3v
    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
        } else {
            super.updateScene(str, map);
        }
    }

    @Override // tb.n3v
    public void viewBecomeVisible(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7619ab", new Object[]{this, str, str2, str3});
        } else {
            super.viewBecomeVisible(str, str2, str3);
        }
    }
}
