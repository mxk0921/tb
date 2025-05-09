package com.taobao.message.chatv2.viewcenter;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner.Schedules;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ViewCenterUIEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ViewCenterUIEventManager viewCenterUIEventManager;
    private List<IUIEvent> uiEventList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface IUIEvent {
        void onEvent(Event event, int i);
    }

    static {
        t2o.a(552599622);
    }

    private ViewCenterUIEventManager() {
    }

    public static /* synthetic */ List access$000(ViewCenterUIEventManager viewCenterUIEventManager2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98313533", new Object[]{viewCenterUIEventManager2});
        }
        return viewCenterUIEventManager2.uiEventList;
    }

    public static ViewCenterUIEventManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewCenterUIEventManager) ipChange.ipc$dispatch("fd112cad", new Object[0]);
        }
        if (viewCenterUIEventManager == null) {
            synchronized (ViewCenterUIEventManager.class) {
                try {
                    if (viewCenterUIEventManager == null) {
                        viewCenterUIEventManager = new ViewCenterUIEventManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return viewCenterUIEventManager;
    }

    public void addEventListener(IUIEvent iUIEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c822c98", new Object[]{this, iUIEvent});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new RuntimeException("  is need UI Thread");
        } else if (!this.uiEventList.contains(iUIEvent)) {
            this.uiEventList.add(iUIEvent);
        }
    }

    public void onEvent(final Event event, final int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d565ea3", new Object[]{this, event, iArr});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterUIEventManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (IUIEvent iUIEvent : ViewCenterUIEventManager.access$000(ViewCenterUIEventManager.this)) {
                        try {
                            int[] iArr2 = iArr;
                            if (iArr2 != null) {
                                i = iArr2[0];
                            } else {
                                i = -1;
                            }
                            iUIEvent.onEvent(event, i);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public void removeEventListener(IUIEvent iUIEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79fda15", new Object[]{this, iUIEvent});
        } else {
            this.uiEventList.remove(iUIEvent);
        }
    }
}
