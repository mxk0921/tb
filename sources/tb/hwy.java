package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hwy implements f3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveEventCenter";
    public static List<String> c;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<s3c> f20937a = new CopyOnWriteArrayList<>();

    static {
        t2o.a(806355018);
        t2o.a(806355015);
    }

    public hwy() {
        o3s.b(TAG, "TBLiveEventCenter 初始化，唯一ID：" + hashCode());
    }

    @Override // tb.f3c
    public void a(s3c s3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f43cf0", new Object[]{this, s3cVar});
            return;
        }
        if (s3cVar != null && !this.f20937a.contains(s3cVar)) {
            this.f20937a.add(s3cVar);
        }
        if (iw0.j(v2s.o().f().getApplication()) && s3cVar != null) {
            s3cVar.observeUniqueIdentification();
            s3cVar.bizCode();
            o3s.b(TAG, "注册事件监听：observer：" + s3cVar + ", 唯一ID：" + s3cVar.observeUniqueIdentification());
        }
    }

    @Override // tb.f3c
    public void b(s3c s3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c303c9", new Object[]{this, s3cVar});
        } else if (s3cVar != null && this.f20937a.contains(s3cVar)) {
            this.f20937a.remove(s3cVar);
            if (this.f20937a.isEmpty()) {
                f();
            }
        }
    }

    @Override // tb.f3c
    public void c(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd67ca11", new Object[]{this, str, obj, str2});
        } else {
            i(str, obj, str2);
        }
    }

    @Override // tb.f3c
    @Deprecated
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506548eb", new Object[]{this, str});
        } else {
            e(str, null);
        }
    }

    @Override // tb.f3c
    @Deprecated
    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4ef407", new Object[]{this, str, obj});
        } else {
            h(str, obj);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f20937a.clear();
        }
    }

    public void h(String str, Object obj) {
        String[] observeEvents;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673d926c", new Object[]{this, str, obj});
            return;
        }
        Iterator<s3c> it = this.f20937a.iterator();
        while (it.hasNext()) {
            s3c next = it.next();
            if (next != null && (observeEvents = next.observeEvents()) != null) {
                int length = observeEvents.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (str.equals(observeEvents[i])) {
                        next.onEvent(str, obj);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public void i(String str, Object obj, String str2) {
        boolean z;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64637936", new Object[]{this, str, obj, str2});
            return;
        }
        Iterator<s3c> it = this.f20937a.iterator();
        while (it.hasNext()) {
            s3c next = it.next();
            if (next != null) {
                String observeUniqueIdentification = next.observeUniqueIdentification();
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(observeUniqueIdentification)) {
                    z = true;
                } else {
                    z = observeUniqueIdentification.contains(str2);
                }
                if (qvs.x() || z || ((list = c) != null && list.contains(next.bizCode()))) {
                    String[] observeEvents = next.observeEvents();
                    if (observeEvents != null) {
                        int length = observeEvents.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (str.equals(observeEvents[i])) {
                                next.onEvent(str, obj);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void j(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead54bd2", new Object[]{this, activity, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<s3c> it = this.f20937a.iterator();
        while (it.hasNext()) {
            s3c next = it.next();
            if (next instanceof BaseFrame) {
                BaseFrame baseFrame = (BaseFrame) next;
                if (activity == baseFrame.mContext) {
                    arrayList.add(next);
                    o3s.b(TAG, "内存泄漏优化，兜底移除：" + baseFrame.getComponentName());
                }
            }
        }
        o3s.b(TAG, "直播页面退出，新修复泄漏组件个数：" + arrayList.size() + ", globalUniqueId: " + str);
        this.f20937a.removeAll(arrayList);
    }
}
