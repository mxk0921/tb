package com.etao.feimagesearch.quicksearch;

import android.content.Intent;
import android.os.IBinder;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c21;
import tb.dwo;
import tb.hgw;
import tb.t2o;
import tb.yvo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ScreenShotService extends TileService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857693);
    }

    public static /* synthetic */ Object ipc$super(ScreenShotService screenShotService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1997045008:
                super.onClick();
                return null;
            case 12073338:
                super.onTileRemoved();
                return null;
            case 51128253:
                return super.onBind((Intent) objArr[0]);
            case 193747647:
                super.onStartListening();
                return null;
            case 888453850:
                super.onTileAdded();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/quicksearch/ScreenShotService");
        }
    }

    public final void a() {
        Tile qsTile;
        Tile qsTile2;
        Tile qsTile3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8c6a8f", new Object[]{this});
            return;
        }
        try {
            qsTile = getQsTile();
            if (qsTile != null) {
                qsTile2 = getQsTile();
                qsTile2.setState(1);
                qsTile3 = getQsTile();
                qsTile3.updateTile();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.service.quicksettings.TileService, android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        try {
            return super.onBind(intent);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c5abf", new Object[]{this});
            return;
        }
        super.onStartListening();
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f4bada", new Object[]{this});
            return;
        }
        super.onTileAdded();
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileRemoved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8397a", new Object[]{this});
            return;
        }
        super.onTileRemoved();
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        super.onClick();
        Intent intent = new Intent(this, ScreenRecordActivity.class);
        intent.putExtra(dwo.FOREGROUND_KEY, !c21.g().getBoolean("isInBackground", false));
        intent.addFlags(268435456);
        yvo.b(this, intent);
        hgw.b(this);
    }
}
