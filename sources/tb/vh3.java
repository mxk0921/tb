package tb;

import android.app.Application;
import android.os.HandlerThread;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vh3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIconMgr";
    public static volatile vh3 g;

    /* renamed from: a  reason: collision with root package name */
    public volatile HandlerThread f30012a;
    public volatile fi3 b;
    public ChangeAppIconJSModel d;
    public ChangeAppIconJSModel e;
    public final Object c = new Object();
    public final Application f = qh3.k();

    static {
        t2o.a(284164099);
    }

    public static vh3 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vh3) ipChange.ipc$dispatch("11157bb1", new Object[0]);
        }
        if (g == null) {
            synchronized (vh3.class) {
                try {
                    if (g == null) {
                        g = new vh3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final void b(umb umbVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a273d4", new Object[]{this, umbVar, new Integer(i)});
        } else if (umbVar != null) {
            AdapterForTLog.loge(TAG, "callFailResult dump:" + Log.getStackTraceString(new Throwable()));
            umbVar.onResult(tmb.a(false, false, i));
        }
    }

    public void c(ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26aa6a58", new Object[]{this, changeAppIconJSModel});
        } else {
            d(changeAppIconJSModel, null);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        synchronized (this.c) {
            try {
                AdapterForTLog.loge(TAG, "destroy:" + this.f30012a);
                if (this.f30012a != null) {
                    this.f30012a.quitSafely();
                    this.f30012a = null;
                    this.b.removeCallbacksAndMessages(null);
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ChangeAppIconJSModel g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeAppIconJSModel) ipChange.ipc$dispatch("c8a61ea9", new Object[]{this});
        }
        return this.e;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bcfb82", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, "registerApm");
        c21.c(new u11() { // from class: tb.uh3
            @Override // tb.u11, com.taobao.application.common.IApmEventListener
            public final void onEvent(int i) {
                vh3.this.h(i);
            }
        });
    }

    public final void j(ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac7fda7", new Object[]{this, changeAppIconJSModel});
            return;
        }
        try {
            AdapterForTLog.loge(TAG, "setChangeAppIconInBackground :" + changeAppIconJSModel);
            this.d = changeAppIconJSModel;
            changeAppIconJSModel.changeType = "NOW";
        } catch (Exception e) {
            e.printStackTrace();
            AdapterForTLog.loge(TAG, "setChangeAppIconInBackground error:", e);
        }
    }

    public final void k(AppIconComponentName appIconComponentName, umb umbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95732553", new Object[]{this, appIconComponentName, umbVar});
            return;
        }
        AdapterForTLog.loge(TAG, "startCheck:" + this.f30012a);
        synchronized (this.c) {
            try {
                if (this.f30012a != null) {
                    if (!this.f30012a.isAlive()) {
                    }
                    this.b.f(appIconComponentName, umbVar, ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_TOTAL_TIME_MS, 2000L), ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_INTERVAL_TIME_MS, 300L));
                }
                this.f30012a = new HandlerThread("changeIcon");
                this.f30012a.start();
                this.b = new fi3(this.f30012a.getLooper());
                AdapterForTLog.loge(TAG, "startCheck init:" + this.f30012a);
                this.b.f(appIconComponentName, umbVar, ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_TOTAL_TIME_MS, 2000L), ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_INTERVAL_TIME_MS, 300L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void h(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b815e7ee", new Object[]{this, new Integer(i)});
        } else if (faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN, true)) {
            if (i == 1 || i == 50) {
                boolean z = faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, false);
                if (this.d != null || z) {
                    StringBuilder sb = new StringBuilder("registerApm onEvent type:");
                    sb.append(i);
                    sb.append(" change2DefaultIcon:");
                    sb.append(z);
                    sb.append(" ChangeAppIconJSModel:");
                    ChangeAppIconJSModel changeAppIconJSModel = this.d;
                    if (changeAppIconJSModel == null) {
                        str = "null";
                    } else {
                        str = changeAppIconJSModel.toString();
                    }
                    sb.append(str);
                    AdapterForTLog.loge(TAG, sb.toString());
                    ChangeAppIconJSModel changeAppIconJSModel2 = this.d;
                    if (changeAppIconJSModel2 != null) {
                        c(changeAppIconJSModel2);
                    } else if (z) {
                        faq.f().i(ubl.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, false).a();
                        qh3.h(true);
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:46:0x015f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public synchronized void d(com.taobao.android.change.app.icon.model.ChangeAppIconJSModel r19, tb.umb r20) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vh3.d(com.taobao.android.change.app.icon.model.ChangeAppIconJSModel, tb.umb):void");
    }
}
