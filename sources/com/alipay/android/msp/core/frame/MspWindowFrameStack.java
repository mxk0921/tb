package com.alipay.android.msp.core.frame;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspWindowFrameStack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MspContext d;
    public final List<MspWindowFrame> b = new ArrayList();
    public final Object c = new Object();
    public final Map<String, MspWindowFrame> e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final BlockingDeque<MspWindowFrame> f3552a = new LinkedBlockingDeque();

    public MspWindowFrameStack(MspContext mspContext) {
        this.d = mspContext;
    }

    public final void a(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312f49b1", new Object[]{this, mspWindowFrame});
        } else if (mspWindowFrame != null) {
            synchronized (this.b) {
                ((ArrayList) this.b).add(mspWindowFrame);
            }
            String tplHashId = mspWindowFrame.getTplHashId();
            if (!TextUtils.isEmpty(tplHashId)) {
                ((HashMap) this.e).remove(tplHashId);
            }
        }
    }

    public final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (!this.f3552a.isEmpty()) {
            LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameStack.pop", "frame count:" + ((LinkedBlockingDeque) this.f3552a).size());
            a((MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).removeLast());
        }
    }

    public final synchronized MspWindowFrame c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("a0e3fa60", new Object[]{this});
        } else if (this.f3552a.isEmpty()) {
            return null;
        } else {
            MspWindowFrame mspWindowFrame = (MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).pop();
            LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameStack.pop", "frame count:" + ((LinkedBlockingDeque) this.f3552a).size());
            a(mspWindowFrame);
            return mspWindowFrame;
        }
    }

    public void clearAllContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9ef591", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                Iterator it = ((LinkedBlockingDeque) this.f3552a).iterator();
                while (it.hasNext()) {
                    MspWindowFrame mspWindowFrame = (MspWindowFrame) it.next();
                    Context context = this.d.getContext();
                    if (context != null) {
                        if (this.d.getGrayUnifiedReadPadConfig()) {
                            if (this.d.getMspExtSceneManager() != null && this.d.getMspExtSceneManager().isAutoRotatingTpl(mspWindowFrame.getTplId())) {
                                mspWindowFrame.removeView();
                            }
                        } else if (MspExtSceneManager.isAutoRotatingTpl(mspWindowFrame.getTplId(), context)) {
                            mspWindowFrame.removeView();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearWin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeaa356", new Object[]{this});
            return;
        }
        try {
            synchronized (this.b) {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    MspWindowFrame mspWindowFrame = (MspWindowFrame) it.next();
                    if (mspWindowFrame != null) {
                        mspWindowFrame.dispose();
                    }
                }
                ((ArrayList) this.b).clear();
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public synchronized MspWindowFrame findFrameBySender(Object obj) {
        MspWindowFrame[] mspWindowFrameArr;
        MspWindowFrame[] mspWindowFrameArr2;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MspWindowFrame) ipChange.ipc$dispatch("7effde59", new Object[]{this, obj});
            }
            if (!this.f3552a.isEmpty()) {
                for (MspWindowFrame mspWindowFrame : (MspWindowFrame[]) ((LinkedBlockingDeque) this.f3552a).toArray(new MspWindowFrame[0])) {
                    FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(mspWindowFrame.getContentView());
                    if (fbContextFromView != null && fbContextFromView.equals(obj)) {
                        return mspWindowFrame;
                    }
                }
            }
            if (!((ArrayList) this.b).isEmpty()) {
                for (MspWindowFrame mspWindowFrame2 : (MspWindowFrame[]) ((ArrayList) this.b).toArray(new MspWindowFrame[0])) {
                    FBContext fbContextFromView2 = PluginManager.getRender().getFbContextFromView(mspWindowFrame2.getContentView());
                    if (fbContextFromView2 != null && fbContextFromView2.equals(obj)) {
                        return mspWindowFrame2;
                    }
                }
            }
            return null;
        }
    }

    public MspWindowFrame getCurrentDefaultWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("9b956367", new Object[]{this});
        }
        if (this.f3552a.isEmpty()) {
            return null;
        }
        MspWindowFrame[] mspWindowFrameArr = (MspWindowFrame[]) ((LinkedBlockingDeque) this.f3552a).toArray(new MspWindowFrame[0]);
        for (int length = mspWindowFrameArr.length - 1; length >= 0; length--) {
            MspWindowFrame mspWindowFrame = mspWindowFrameArr[length];
            if (mspWindowFrame.getWindowType() == 11) {
                return mspWindowFrame;
            }
        }
        return null;
    }

    public MspWindowFrame getMspWindowFrameViaHash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("eff7ff8", new Object[]{this, str});
        }
        return (MspWindowFrame) ((HashMap) this.e).get(str);
    }

    public MspWindowFrame getTopTplFrame() {
        MspWindowFrame[] mspWindowFrameArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("a81a7019", new Object[]{this});
        }
        if (this.f3552a.isEmpty()) {
            return null;
        }
        for (MspWindowFrame mspWindowFrame : (MspWindowFrame[]) ((LinkedBlockingDeque) this.f3552a).toArray(new MspWindowFrame[0])) {
            if (mspWindowFrame != null && mspWindowFrame.isDefaultWindow()) {
                return mspWindowFrame;
            }
        }
        return null;
    }

    public MspWindowFrame getTopTplOrNativeFrame() {
        MspWindowFrame[] mspWindowFrameArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("6777fa93", new Object[]{this});
        }
        if (this.f3552a.isEmpty()) {
            return null;
        }
        for (MspWindowFrame mspWindowFrame : (MspWindowFrame[]) ((LinkedBlockingDeque) this.f3552a).toArray(new MspWindowFrame[0])) {
            if (mspWindowFrame != null && (mspWindowFrame.getWindowType() == 11 || mspWindowFrame.getWindowType() == 14)) {
                return mspWindowFrame;
            }
        }
        return null;
    }

    public boolean isMspWindowFrameHasCallback(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dab3253", new Object[]{this, mspWindowFrame})).booleanValue();
        }
        return ((HashMap) this.e).containsValue(mspWindowFrame);
    }

    public void markAllFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8362a40", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                Iterator it = ((LinkedBlockingDeque) this.f3552a).iterator();
                while (it.hasNext()) {
                    ((MspWindowFrame) it.next()).setInPrevStack(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MspWindowFrame peekFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("199f1223", new Object[]{this});
        }
        if (!this.f3552a.isEmpty()) {
            return (MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).peek();
        }
        return null;
    }

    public void popTopFrame(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3a785a", new Object[]{this, str});
            return;
        }
        synchronized (this.c) {
            try {
                if (!this.f3552a.isEmpty()) {
                    MspWindowFrame mspWindowFrame = (MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).peek();
                    if (mspWindowFrame != null) {
                        str2 = mspWindowFrame.getTplId();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        if (str2.endsWith("@".concat(String.valueOf(str)))) {
                            c();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerFrameOnHash(String str, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262cd8e", new Object[]{this, str, mspWindowFrame});
        } else if (!TextUtils.isEmpty(str) && mspWindowFrame != null) {
            ((HashMap) this.e).put(str, mspWindowFrame);
        }
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return ((LinkedBlockingDeque) this.f3552a).size();
    }

    public void clearDataStack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f883089c", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            try {
                if (z) {
                    MspWindowFrame mspWindowFrame = (MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).peekFirst();
                    while (((LinkedBlockingDeque) this.f3552a).peekLast() != null && ((LinkedBlockingDeque) this.f3552a).peekLast() != mspWindowFrame) {
                        b();
                        LogUtil.record(1, "MspWindowFrameStack:clearDataStack", "pop() != null");
                    }
                } else {
                    while (c() != null) {
                        LogUtil.record(1, "MspWindowFrameStack:clearDataStack", "pop() != null");
                    }
                    ((LinkedBlockingDeque) this.f3552a).clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pushFrame(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bb3280", new Object[]{this, mspWindowFrame});
            return;
        }
        MspContext mspContext = this.d;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_PUSH");
        }
        synchronized (this.c) {
            try {
                if (mspWindowFrame != null) {
                    ((LinkedBlockingDeque) this.f3552a).push(mspWindowFrame);
                    LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameStack.pushFrame", "frame count:" + ((LinkedBlockingDeque) this.f3552a).size());
                    MspContext mspContext2 = this.d;
                    if (mspContext2 != null) {
                        MspUIClient mspUIClient = mspContext2.getMspUIClient();
                        if (mspUIClient != null) {
                            mspUIClient.onWindowChanged(mspWindowFrame);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean popTopWindowFrame(boolean z, String str) {
        MspWindowFrame mspWindowFrame;
        MspWindowFrame mspWindowFrame2;
        MspContext mspContext;
        MspUIClient mspUIClient;
        EmptyStackException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86356022", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        synchronized (this.c) {
            try {
                if (this.f3552a.isEmpty()) {
                    return true;
                }
                LogUtil.record(2, "MspWindowFrameStack:popTopWindowFrame", "tplId=" + str + " , isDestroyView=" + z);
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    mspWindowFrame = null;
                    try {
                        if (this.f3552a.isEmpty()) {
                            break;
                        }
                        MspWindowFrame mspWindowFrame3 = (MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).peek();
                        if (mspWindowFrame3 == null) {
                            return false;
                        }
                        if (z && !z2) {
                            try {
                                String tplId = mspWindowFrame3.getTplId();
                                LogUtil.record(1, "Destroy_frameTplId", tplId);
                                if (tplId == null) {
                                    return false;
                                }
                                if (!tplId.endsWith("@".concat(String.valueOf(str)))) {
                                    return false;
                                }
                                z2 = true;
                            } catch (EmptyStackException e2) {
                                e = e2;
                                mspWindowFrame = mspWindowFrame3;
                                MspContext mspContext2 = this.d;
                                if (mspContext2 != null) {
                                    mspContext2.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
                                }
                                LogUtil.printExceptionStackTrace(e);
                                if (mspWindowFrame == null) {
                                    mspWindowFrame2.setBackAnim(true);
                                    mspWindowFrame2.setDestroyView(z);
                                    mspContext = this.d;
                                    if (mspContext == null) {
                                        mspUIClient.onWindowChanged(mspWindowFrame2);
                                    }
                                }
                                return this.f3552a.isEmpty();
                            }
                        }
                        if (mspWindowFrame3.isDefaultWindow()) {
                            if (z3) {
                                mspWindowFrame = mspWindowFrame3;
                                break;
                            }
                            z3 = true;
                        }
                        c();
                    } catch (EmptyStackException e3) {
                        e = e3;
                    }
                }
                if (!(mspWindowFrame == null || !mspWindowFrame.isDefaultWindow() || (mspWindowFrame2 = (MspWindowFrame) ((LinkedBlockingDeque) this.f3552a).peek()) == null)) {
                    mspWindowFrame2.setBackAnim(true);
                    mspWindowFrame2.setDestroyView(z);
                    mspContext = this.d;
                    if (!(mspContext == null || (mspUIClient = mspContext.getMspUIClient()) == null)) {
                        mspUIClient.onWindowChanged(mspWindowFrame2);
                    }
                }
                return this.f3552a.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
