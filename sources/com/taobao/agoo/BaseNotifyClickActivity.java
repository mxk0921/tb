package com.taobao.agoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.HashSet;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BaseNotifyClickActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Naccs.BaseNotifyClickActivity";
    public static Set<INotifyListener> notifyListeners;
    private BaseNotifyClick baseNotifyClick = new BaseNotifyClick() { // from class: com.taobao.agoo.BaseNotifyClickActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/BaseNotifyClickActivity$1");
        }

        @Override // com.taobao.agoo.BaseNotifyClick
        public void onMessage(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea2edc6c", new Object[]{this, intent});
            } else {
                BaseNotifyClickActivity.this.onMessage(intent);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface INotifyListener {
        String getMsgSource();

        String parseMsgFromIntent(Intent intent);
    }

    static {
        t2o.a(343933270);
    }

    public static void addNotifyListener(INotifyListener iNotifyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08a9093", new Object[]{iNotifyListener});
            return;
        }
        if (notifyListeners == null) {
            notifyListeners = new HashSet();
        }
        notifyListeners.add(iNotifyListener);
    }

    public static /* synthetic */ Object ipc$super(BaseNotifyClickActivity baseNotifyClickActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1264052993) {
            super.onNewIntent((Intent) objArr[0]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/agoo/BaseNotifyClickActivity");
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        ALog.i(TAG, "onCreate", new Object[0]);
        this.baseNotifyClick.onCreate(this, getIntent());
    }

    public void onMessage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2edc6c", new Object[]{this, intent});
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        ALog.i(TAG, "onNewIntent", new Object[0]);
        this.baseNotifyClick.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }
}
