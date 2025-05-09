package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContactsResult;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yk4 extends ua0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String[] PHONES_PROJECTION = {"display_name", "data1"};
    public static final int REQUEST_CODE = 49354;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f32140a;
    public final cqb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(102760454);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(102760453);
    }

    public yk4(cqb cqbVar) {
        this.b = cqbVar;
    }

    public static /* synthetic */ Object ipc$super(yk4 yk4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/contacts/ContactsChooseActivityCallback");
    }

    @Override // tb.ua0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        ckf.g(activity, "activity");
        this.f32140a = new WeakReference<>(activity);
        try {
            activity.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), REQUEST_CODE);
        } catch (Throwable th) {
            cqb cqbVar = this.b;
            if (cqbVar != null) {
                cqbVar.O(new ErrorResult("UNKNOWN_ERROR", th.toString(), (Map) null, 4, (a07) null));
            }
        }
    }

    @Override // tb.ua0
    public void a(int i, int i2, Intent intent) {
        Activity activity;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WeakReference<Activity> weakReference = this.f32140a;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            if (i == 49354 && i2 == -1) {
                if (!(intent == null || intent.getData() == null)) {
                    Uri data = intent.getData();
                    if (data == null) {
                        data = null;
                    }
                    if (data != null) {
                        String str2 = "";
                        if (data == null || (str = data.getLastPathSegment()) == null) {
                            str = str2;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            List<tk4> a2 = wk4.a(activity, str, null, null, this.b);
                            if (a2 == null) {
                                cqb cqbVar = this.b;
                                if (cqbVar != null) {
                                    cqbVar.O(new ErrorResult("UNKNOWN_ERROR", "getContacts is null", (Map) null, 4, (a07) null));
                                }
                            } else if (a2.isEmpty()) {
                                cqb cqbVar2 = this.b;
                                if (cqbVar2 != null) {
                                    cqbVar2.O(new ErrorResult("UNKNOWN_ERROR", "查询到空数据", (Map) null, 4, (a07) null));
                                }
                                activity.finish();
                                return;
                            } else {
                                tk4 tk4Var = a2.get(0);
                                String str3 = tk4Var.b;
                                if (str3 == null) {
                                    str3 = str2;
                                }
                                String str4 = tk4Var.f28761a;
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                cqb cqbVar3 = this.b;
                                if (cqbVar3 != null) {
                                    ContactsResult contactsResult = new ContactsResult();
                                    contactsResult.name = str2;
                                    contactsResult.phone = str3;
                                    xhv xhvVar = xhv.INSTANCE;
                                    cqbVar3.z(contactsResult);
                                }
                            }
                        } else {
                            cqb cqbVar4 = this.b;
                            if (cqbVar4 != null) {
                                cqbVar4.O(new ErrorResult("UNKNOWN_ERROR", "contactId is null", (Map) null, 4, (a07) null));
                            }
                        }
                    }
                }
                cqb cqbVar5 = this.b;
                if (cqbVar5 != null) {
                    cqbVar5.O(new ErrorResult("UNKNOWN_ERROR", "data == null", (Map) null, 4, (a07) null));
                }
                activity.finish();
                return;
            }
            cqb cqbVar6 = this.b;
            if (cqbVar6 != null) {
                cqbVar6.b1();
            }
            activity.finish();
        }
    }
}
