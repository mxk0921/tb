package tb;

import com.taobao.orange.OrangeConfig;
import java.util.LinkedList;
import java.util.List;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rgi {

    /* renamed from: a  reason: collision with root package name */
    public final String f27360a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public AbstractMediaPlayer f;
    public AbstractMediaPlayer g;
    public List<a> h;
    public float i;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        int getCurrentPosition();

        int getDestoryState();

        boolean isPlaying();

        boolean isVisible();

        void release(boolean z);
    }

    static {
        t2o.a(774897930);
    }

    public rgi(String str) {
        this.i = Float.valueOf(OrangeConfig.getInstance().getConfig("DWInteractive", "initVolume", "0")).floatValue();
        this.j = true;
        this.f27360a = str;
    }

    public rgi(String str, a aVar) {
        this.i = Float.valueOf(OrangeConfig.getInstance().getConfig("DWInteractive", "initVolume", "0")).floatValue();
        this.j = true;
        LinkedList linkedList = new LinkedList();
        this.h = linkedList;
        linkedList.add(aVar);
        this.f27360a = str;
    }

    public rgi() {
        this.i = Float.valueOf(OrangeConfig.getInstance().getConfig("DWInteractive", "initVolume", "0")).floatValue();
        this.j = true;
        this.f27360a = null;
    }
}
