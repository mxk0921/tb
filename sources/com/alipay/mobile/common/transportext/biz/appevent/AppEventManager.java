package com.alipay.mobile.common.transportext.biz.appevent;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<EventInterface> f4178a = new ArrayList(2);
    public static volatile boolean b = false;
    public static volatile EventInterface c = new EventInterface() { // from class: com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17afa593", new Object[]{this})).booleanValue();
            }
            if (AppEventManager.access$000().isEmpty()) {
                return false;
            }
            return true;
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onAppLeaveEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abfccd8c", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onAppLeaveEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onAppResumeEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onAppResumeEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onSeceenOffEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ed782e", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onSeceenOffEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onSeceenOnEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70f150c6", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onSeceenOnEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onSyncInitChanged(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onSyncInitChanged(map);
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EventInterface {
        void onAppLeaveEvent();

        void onAppResumeEvent();

        void onSeceenOffEvent();

        void onSeceenOnEvent();

        void onSyncInitChanged(Map<String, String> map);
    }

    public static /* synthetic */ List access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54cf0df0", new Object[0]);
        }
        return f4178a;
    }

    public static EventInterface getListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventInterface) ipChange.ipc$dispatch("5645b0e2", new Object[0]);
        }
        return c;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!b) {
            b = true;
            LogUtilAmnet.i("amnet_AppEventManager", "init: [ AppEventManager ] ");
            AmnetScreenOnOffReceiver.start();
        }
    }

    public static void register(EventInterface eventInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a05c57", new Object[]{eventInterface});
            return;
        }
        ((ArrayList) f4178a).add(eventInterface);
        if (!b) {
            init();
        }
    }

    public static void unregister(EventInterface eventInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f029e", new Object[]{eventInterface});
        } else {
            ((ArrayList) f4178a).remove(eventInterface);
        }
    }
}
