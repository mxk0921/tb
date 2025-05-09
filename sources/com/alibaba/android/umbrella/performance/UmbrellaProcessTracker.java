package com.alibaba.android.umbrella.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.eym;
import tb.gdv;
import tb.idv;
import tb.odv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UmbrellaProcessTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler trackHandler;
    private static HandlerThread trackHandlerThread = new HandlerThread("Umbrella-Performance-Trace-thread");
    private static final ConcurrentHashMap<String, Long> sPageList = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umbrella/performance/UmbrellaProcessTracker$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            com.alibaba.android.umbrella.performance.a aVar = (com.alibaba.android.umbrella.performance.a) message.obj;
            int i = aVar.f2392a;
            if (i == 3) {
                eym.i(aVar);
            } else if (i == 4) {
                eym.j(aVar);
            } else if (i == 1) {
                eym.k(aVar);
            } else if (i == 2) {
                eym.g(aVar);
            } else if (i == 5) {
                eym.e(aVar);
            } else if (i == 7) {
                eym.l(aVar);
            } else if (i == 6) {
                eym.a(aVar);
            } else if (i == 8) {
                eym.h(aVar);
            }
        }
    }

    public static void addAbTestInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5436afc7", new Object[]{str, str2, str3});
        } else if (!odv.a(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(6).b(str2).a(str3).j());
        }
    }

    public static void addArgs(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4260276", new Object[]{str, map});
        } else if (!odv.a(str) && map != null && map.size() >= 1 && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(2).i(map).j());
        }
    }

    public static void addOtherProcess(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bff89", new Object[]{str, str2, new Long(j)});
        } else if (!odv.a(str) && !TextUtils.isEmpty(str2) && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(8).l(j).m(str2).j());
        }
    }

    public static void addPageLoad(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb1b5bd", new Object[]{str, new Long(j)});
        } else if (!odv.a(str) && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(3).o(gdv.PAGELOAD).l(j).j());
        }
    }

    public static void addProcess(String str, gdv gdvVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894ad338", new Object[]{str, gdvVar, new Long(j)});
        } else if (!odv.a(str) && gdvVar != null && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(3).o(gdvVar).l(j).j());
        }
    }

    public static void addSubProcess(String str, gdv gdvVar, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7a556c", new Object[]{str, gdvVar, str2, new Long(j)});
        } else if (!odv.a(str) && gdvVar != null && !TextUtils.isEmpty(str2) && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(4).o(gdvVar).m(str2).l(j).j());
        }
    }

    public static void commit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d9088", new Object[]{str});
        } else if (!odv.a(str) && isContainBiz(str)) {
            removeBiz(str);
            sendProcessEvent(new a.b(str, 0L).n(5).j());
        }
    }

    private static synchronized void init() {
        synchronized (UmbrellaProcessTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (trackHandlerThread.getState() == Thread.State.NEW) {
                trackHandlerThread.start();
                trackHandler = new a(trackHandlerThread.getLooper());
            }
        }
    }

    private static boolean isContainBiz(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8250d23e", new Object[]{str})).booleanValue();
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = sPageList;
        if (!concurrentHashMap.containsKey(str) || (l = concurrentHashMap.get(str)) == null) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < 20000) {
            return true;
        }
        removeBiz(str);
        return false;
    }

    private static void recordBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae41813", new Object[]{str});
        } else {
            sPageList.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void register(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d57cf4", new Object[]{str});
        } else if (!odv.a(str)) {
            if ((idv.H() && idv.r()) || idv.x(str)) {
                if (trackHandlerThread.getState() == Thread.State.NEW) {
                    init();
                }
                recordBiz(str);
                sendProcessEvent(new a.b(str).n(1).j());
            }
        }
    }

    private static void removeBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f209b40", new Object[]{str});
        } else {
            sPageList.remove(str);
        }
    }

    private static void sendProcessEvent(com.alibaba.android.umbrella.performance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e38dd53", new Object[]{aVar});
            return;
        }
        Handler handler = trackHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = aVar;
            trackHandler.sendMessage(obtainMessage);
        }
    }

    public static void setChildBizName(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c18111f", new Object[]{str, str2});
        } else if (!odv.a(str) && !TextUtils.isEmpty(str2) && isContainBiz(str)) {
            sendProcessEvent(new a.b(str).n(7).k(str2).j());
        }
    }

    public static void addArgs(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea77ec3", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            addArgs(str, hashMap);
        }
    }
}
