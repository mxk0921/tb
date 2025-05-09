package com.ali.user.mobile.harmony.i;

import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.rpc.login.model.SessionList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IHarmonyLoginBackup {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IBackup {
        void backup(boolean z);
    }

    void backupHistoryAccountList(LoginHistory loginHistory, IBackup iBackup);

    void backupSessionList(SessionList sessionList, IBackup iBackup);

    void backupUmidToken(String str, IBackup iBackup);

    void deleteHistoryAccountList(IBackup iBackup);

    void deleteSessionList(IBackup iBackup);

    void deleteUmidToken(IBackup iBackup);
}
