package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VirtualThread extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private VThread vThread;

    static {
        t2o.a(969932815);
    }

    public VirtualThread() {
    }

    public static Thread currentCarrier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("774e3e41", new Object[0]);
        }
        return VThread.currentCarrierThread();
    }

    public static Thread currentThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("98f2c31d", new Object[0]);
        }
        return VThread.currentVirtualThread();
    }

    public static Thread currentVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("87ad91a4", new Object[0]);
        }
        return VThread.currentVirtualThread();
    }

    public static /* synthetic */ Object ipc$super(VirtualThread virtualThread, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.start();
                return null;
            case -2128160755:
                return super.toString();
            case -1664699528:
                return super.getState();
            case -1663388525:
                return super.getContextClassLoader();
            case -806975192:
                return super.getUncaughtExceptionHandler();
            case 76031173:
                super.setContextClassLoader((ClassLoader) objArr[0]);
                return null;
            case 500870924:
                return new Long(super.getId());
            case 909953386:
                super.interrupt();
                return null;
            case 1021523762:
                super.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) objArr[0]);
                return null;
            case 1083380861:
                return super.getStackTrace();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/VirtualThread");
        }
    }

    public static boolean isWorkingOn(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f63c62", new Object[]{thread})).booleanValue();
        }
        if (VThread.currentVirtualThread() == thread) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Thread
    public ClassLoader getContextClassLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("9cdab493", new Object[]{this});
        }
        return super.getContextClassLoader();
    }

    @Override // java.lang.Thread
    public long getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        VThread vThread = this.vThread;
        if (vThread != null) {
            return vThread.getId();
        }
        return super.getId();
    }

    @Override // java.lang.Thread
    public StackTraceElement[] getStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("4093147d", new Object[]{this});
        }
        VThread vThread = this.vThread;
        if (vThread != null) {
            return vThread.getStackTrace();
        }
        return super.getStackTrace();
    }

    @Override // java.lang.Thread
    public Thread.State getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread.State) ipChange.ipc$dispatch("9cc6b378", new Object[]{this});
        }
        VThread vThread = this.vThread;
        if (vThread != null) {
            return vThread.getState();
        }
        return super.getState();
    }

    @Override // java.lang.Thread
    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread.UncaughtExceptionHandler) ipChange.ipc$dispatch("cfe68928", new Object[]{this});
        }
        return super.getUncaughtExceptionHandler();
    }

    @Override // java.lang.Thread
    public void interrupt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363cc96a", new Object[]{this});
            return;
        }
        VThread vThread = this.vThread;
        if (vThread != null) {
            vThread.interrupt();
        } else {
            super.interrupt();
        }
    }

    @Override // java.lang.Thread
    public boolean isInterrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1f3343", new Object[]{this})).booleanValue();
        }
        VThread vThread = this.vThread;
        if (vThread != null) {
            return vThread.isInterrupted();
        }
        return super.isInterrupted();
    }

    public VThread ofVirtual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VThread) ipChange.ipc$dispatch("f8eadaa", new Object[]{this});
        }
        VThread vThread = new VThread((Thread) this);
        this.vThread = vThread;
        return vThread;
    }

    public VThread reVirtual(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VThread) ipChange.ipc$dispatch("3311564c", new Object[]{this, runnable});
        }
        VThread vThread = new VThread(this, runnable);
        this.vThread = vThread;
        return vThread;
    }

    @Override // java.lang.Thread
    public void setContextClassLoader(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48824c5", new Object[]{this, classLoader});
            return;
        }
        super.setContextClassLoader(classLoader);
        VThread vThread = this.vThread;
        if (vThread != null) {
            vThread.setContextClassLoader(classLoader);
        }
    }

    @Override // java.lang.Thread
    public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce33732", new Object[]{this, uncaughtExceptionHandler});
            return;
        }
        super.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        VThread vThread = this.vThread;
        if (vThread != null) {
            vThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    @Override // java.lang.Thread
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        VThread vThread = this.vThread;
        if (vThread != null) {
            vThread.start();
        } else {
            super.start();
        }
    }

    @Override // java.lang.Thread
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString();
    }

    public VirtualThread(VThread vThread) {
        this.vThread = vThread;
    }

    public VirtualThread(Runnable runnable) {
        super(runnable);
    }

    public VirtualThread(String str) {
        super(str);
    }

    public VirtualThread(Runnable runnable, String str) {
        super(runnable, str);
    }
}
