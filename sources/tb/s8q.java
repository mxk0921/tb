package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import com.taobao.social.sdk.net.ISocialService;
import com.taobao.social.sdk.net.SocialServiceImpl;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static s8q b;

    /* renamed from: a  reason: collision with root package name */
    public final ISocialService f27872a = new SocialServiceImpl();

    static {
        t2o.a(817889319);
    }

    public static s8q getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8q) ipChange.ipc$dispatch("680c1cfa", new Object[0]);
        }
        if (b == null) {
            synchronized (s8q.class) {
                try {
                    if (b == null) {
                        b = new s8q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void updateCurrentActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98bb378", new Object[]{activity});
        } else {
            SocialServiceImpl.updateCurrentActivity(activity);
        }
    }

    public void cancelLike(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ddc7f5", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener});
        } else {
            b.f27872a.removeLike(j, j2, iSocialBusinessListener);
        }
    }

    public void getCountAndStatus(wu4 wu4Var, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23f4ec4", new Object[]{this, wu4Var, iSocialBusinessListener});
        } else {
            b.f27872a.getCountAndStatus(wu4Var, iSocialBusinessListener);
        }
    }

    public void like(boolean z, long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116b9d6d", new Object[]{this, new Boolean(z), new Long(j), new Long(j2), str, iSocialBusinessListener});
        } else if (!z) {
            b.f27872a.doLike(j, j2, str, iSocialBusinessListener);
        } else {
            b.f27872a.removeLike(j, j2, iSocialBusinessListener);
        }
    }

    public void proLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a838803a", new Object[]{this});
        }
    }

    public void report(long j, long j2, long j3, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d5df64", new Object[]{this, new Long(j), new Long(j2), new Long(j3), iSocialBusinessListener});
        } else {
            b.f27872a.report(j, j2, j3, iSocialBusinessListener);
        }
    }

    public void cancelLike(String str, String str2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00b8e1", new Object[]{this, str, str2, iSocialBusinessListener});
        } else {
            b.f27872a.removeLike(str, str2, iSocialBusinessListener);
        }
    }

    public void getCountAndStatus(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132f3f1f", new Object[]{this, map, iSocialBusinessListener});
        } else {
            b.f27872a.getCountAndStatus(map, iSocialBusinessListener);
        }
    }

    public void report(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6513d52", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener});
        } else {
            b.f27872a.report(j, j2, iSocialBusinessListener);
        }
    }

    public void cancelLike(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c927a40", new Object[]{this, map, iSocialBusinessListener});
        } else {
            b.f27872a.removeLike(map, iSocialBusinessListener);
        }
    }

    public void like(long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960ab5c5", new Object[]{this, new Long(j), new Long(j2), str, iSocialBusinessListener});
        } else {
            b.f27872a.doLike(j, j2, str, iSocialBusinessListener);
        }
    }

    public void report(p2o p2oVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb46782", new Object[]{this, p2oVar, iSocialBusinessListener});
        } else {
            b.f27872a.report(p2oVar, iSocialBusinessListener);
        }
    }

    public void like(uog uogVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2530bb48", new Object[]{this, uogVar, iSocialBusinessListener});
        } else {
            b.f27872a.doLike(uogVar, iSocialBusinessListener);
        }
    }

    public void report(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b76403", new Object[]{this, map, iSocialBusinessListener});
        } else {
            b.f27872a.report(map, iSocialBusinessListener);
        }
    }

    public void like(vog vogVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c752b594", new Object[]{this, vogVar, iSocialBusinessListener});
        } else {
            b.f27872a.doLike(vogVar, iSocialBusinessListener);
        }
    }

    public void like(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50089026", new Object[]{this, map, iSocialBusinessListener});
        } else {
            b.f27872a.doLike(map, iSocialBusinessListener);
        }
    }
}
