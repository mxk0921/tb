package org.android.spdy;

import anet.channel.entity.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpdyBytePool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int POOL_SIZE = 16;
    private static volatile SpdyBytePool gInstance;
    private static final Object lock = new Object();
    private ArrayList<Deque<SpdyByteArray>> bucks;

    private SpdyBytePool() {
        this.bucks = null;
        this.bucks = new ArrayList<>(16);
        for (int i = 0; i < 16; i++) {
            this.bucks.add(null);
        }
    }

    public static SpdyBytePool getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyBytePool) ipChange.ipc$dispatch("91afcdb", new Object[0]);
        }
        if (gInstance == null) {
            synchronized (lock) {
                try {
                    if (gInstance == null) {
                        gInstance = new SpdyBytePool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return gInstance;
    }

    public SpdyByteArray getSpdyByteArray(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyByteArray) ipChange.ipc$dispatch("5697225", new Object[]{this, new Integer(i)});
        }
        int i3 = (i + EventType.ALL) & (-4096);
        if (i3 > 0) {
            i2 = i3 >> 12;
        }
        SpdyByteArray spdyByteArray = null;
        if (i2 < 16) {
            synchronized (lock) {
                try {
                    Deque<SpdyByteArray> deque = this.bucks.get(i2);
                    if (deque != null && deque.size() > 0) {
                        spdyByteArray = deque.pop();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (spdyByteArray == null) {
            return new SpdyByteArray(i3);
        }
        return spdyByteArray;
    }

    public void recycle(SpdyByteArray spdyByteArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b5089c", new Object[]{this, spdyByteArray});
            return;
        }
        int i2 = spdyByteArray.length;
        if (i2 > 0) {
            i = i2 >> 12;
        }
        if (i < 16) {
            synchronized (lock) {
                try {
                    Deque<SpdyByteArray> deque = this.bucks.get(i);
                    if (deque == null) {
                        deque = new ArrayDeque<>(16);
                        this.bucks.set(i, deque);
                    }
                    deque.push(spdyByteArray);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
