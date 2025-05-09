package com.taobao.uikit.gesture.controller;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.api.IGlobalGestureListener;
import com.taobao.uikit.gesture.controller.SwitchManager;
import com.taobao.uikit.gesture.model.GestureFilter;
import com.taobao.uikit.gesture.model.GlobalGestureListenerWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GlobalGestureListenersManager implements SwitchManager.IConfigChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GlobalGestureListenersManager";
    private final List<GlobalGestureListenerWrapper> mGlobalListeners = new CopyOnWriteArrayList();
    private final Map<String, List<GlobalGestureListenerWrapper>> mGlobalFilters = new ConcurrentHashMap();

    static {
        t2o.a(933232660);
        t2o.a(933232665);
    }

    private boolean addGlobalListener(IGlobalGestureListener iGlobalGestureListener, GestureFilter gestureFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("add81fd4", new Object[]{this, iGlobalGestureListener, gestureFilter})).booleanValue();
        }
        if (iGlobalGestureListener == null || gestureFilter == null) {
            GestureLog.loge(TAG, "addGlobalListener, listener or filter is null");
            return false;
        }
        GlobalGestureListenerWrapper globalGestureListenerWrapper = new GlobalGestureListenerWrapper();
        globalGestureListenerWrapper.listener = iGlobalGestureListener;
        globalGestureListenerWrapper.setFilter(gestureFilter);
        this.mGlobalListeners.add(globalGestureListenerWrapper);
        GestureLog.loge(TAG, "addGlobalListener, addGlobalListeners: " + globalGestureListenerWrapper);
        return true;
    }

    public Map<String, List<GlobalGestureListenerWrapper>> getGlobalFilters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9a11011e", new Object[]{this});
        }
        return this.mGlobalFilters;
    }

    public List<GlobalGestureListenerWrapper> getGlobalListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8b20497a", new Object[]{this});
        }
        return this.mGlobalListeners;
    }

    @Override // com.taobao.uikit.gesture.controller.SwitchManager.IConfigChangeListener
    public void onBlackListChange(List<SwitchManager.GestureConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf316be6", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (GlobalGestureListenerWrapper globalGestureListenerWrapper : this.mGlobalListeners) {
                globalGestureListenerWrapper.onBlackListChange(list);
            }
        }
    }

    public boolean registerGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener, GestureFilter gestureFilter) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c664755", new Object[]{this, iGlobalGestureListener, gestureFilter})).booleanValue();
        }
        boolean addGlobalListener = addGlobalListener(iGlobalGestureListener, gestureFilter);
        boolean addGlobalFilter = addGlobalFilter(iGlobalGestureListener, gestureFilter);
        if (!addGlobalListener || !addGlobalFilter) {
            z = false;
        }
        if (!z) {
            unregisterGlobalGestureListener(iGlobalGestureListener);
            GestureLog.loge(TAG, "registerGlobalGestureListener failed. " + iGlobalGestureListener);
        }
        return z;
    }

    public boolean unregisterGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200bfe54", new Object[]{this, iGlobalGestureListener})).booleanValue();
        }
        boolean removeGlobalFilter = removeGlobalFilter(iGlobalGestureListener);
        boolean removeGlobalListener = removeGlobalListener(iGlobalGestureListener);
        if (!removeGlobalFilter || !removeGlobalListener) {
            return false;
        }
        return true;
    }

    private boolean addGlobalFilter(IGlobalGestureListener iGlobalGestureListener, GestureFilter gestureFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("368ea390", new Object[]{this, iGlobalGestureListener, gestureFilter})).booleanValue();
        }
        if (iGlobalGestureListener == null || gestureFilter == null) {
            GestureLog.loge(TAG, "registerGlobalGestureListener, listener or filter is null");
            return false;
        }
        List<GlobalGestureListenerWrapper> list = this.mGlobalFilters.get(gestureFilter.mActivityName);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (GlobalGestureListenerWrapper globalGestureListenerWrapper : this.mGlobalListeners) {
            if (globalGestureListenerWrapper.listener == iGlobalGestureListener && globalGestureListenerWrapper.getOriginalFilter() == gestureFilter) {
                list.add(globalGestureListenerWrapper);
            }
        }
        this.mGlobalFilters.put(gestureFilter.mActivityName, list);
        GestureLog.loge(TAG, "registerGlobalGestureListener, addGlobalFilter: " + iGlobalGestureListener);
        return true;
    }

    private boolean removeGlobalFilter(IGlobalGestureListener iGlobalGestureListener) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e9f3", new Object[]{this, iGlobalGestureListener})).booleanValue();
        }
        if (iGlobalGestureListener == null) {
            GestureLog.loge(TAG, "removeGlobalFilter, listener or filter is null. ");
            return false;
        }
        for (GlobalGestureListenerWrapper globalGestureListenerWrapper : this.mGlobalListeners) {
            if (globalGestureListenerWrapper.listener == iGlobalGestureListener) {
                GestureFilter gestureFilter = globalGestureListenerWrapper.filter;
                if (gestureFilter == null) {
                    GestureLog.loge(TAG, "removeGlobalFilter, filter is null. " + iGlobalGestureListener);
                } else {
                    List<GlobalGestureListenerWrapper> list = this.mGlobalFilters.get(gestureFilter.mActivityName);
                    if (list == null) {
                        GestureLog.loge(TAG, "removeGlobalFilter, activityListeners is null");
                    } else {
                        list.remove(globalGestureListenerWrapper);
                        GestureLog.loge(TAG, "removeGlobalFilter, removeGlobalFilter: " + iGlobalGestureListener);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private boolean removeGlobalListener(IGlobalGestureListener iGlobalGestureListener) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b8f1f7", new Object[]{this, iGlobalGestureListener})).booleanValue();
        }
        if (iGlobalGestureListener == null) {
            GestureLog.loge(TAG, "removeGlobalListener, listener is null");
            return false;
        }
        Iterator<GlobalGestureListenerWrapper> it = this.mGlobalListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == iGlobalGestureListener) {
                it.remove();
                GestureLog.loge(TAG, "removeGlobalListener, removeGlobalListeners: " + iGlobalGestureListener);
                z = true;
            }
        }
        if (!z) {
            GestureLog.loge(TAG, "removeGlobalListener, listener not found. " + iGlobalGestureListener);
        }
        return z;
    }

    public boolean registerGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener, List<GestureFilter> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3205df6c", new Object[]{this, iGlobalGestureListener, list})).booleanValue();
        }
        if (iGlobalGestureListener == null || list == null || list.isEmpty()) {
            GestureLog.loge(TAG, "registerGlobalGestureListener failed. listener or filter is null. " + iGlobalGestureListener);
            return false;
        }
        for (GestureFilter gestureFilter : list) {
            if (!registerGlobalGestureListener(iGlobalGestureListener, gestureFilter)) {
                return false;
            }
        }
        return true;
    }
}
