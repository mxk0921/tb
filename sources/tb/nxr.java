package tb;

import com.alibaba.ability.impl.riverlogtoggle.RiverlogToggleAbility;
import com.alibaba.ability.utils.AbilityOrangeConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.media.CommandID;
import java.util.Set;
import kotlin.collections.a;
import tb.i11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nxr implements dud {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nxr INSTANCE = new nxr();

    @Override // tb.dud
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26bbf613", new Object[]{this})).booleanValue();
        }
        return RiverlogToggleAbility.isEnableRiverlog();
    }

    @Override // tb.dud
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4191142", new Object[]{this})).booleanValue();
        }
        return AbilityOrangeConfig.INSTANCE.c();
    }

    @Override // tb.dud
    public Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("98c940a5", new Object[]{this});
        }
        return AbilityOrangeConfig.INSTANCE.d();
    }

    @Override // tb.dud
    public Set<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f0010a08", new Object[]{this});
        }
        return AbilityOrangeConfig.INSTANCE.e();
    }

    @Override // tb.dud
    public idb e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idb) ipChange.ipc$dispatch("7a61fc47", new Object[]{this, str});
        }
        ckf.g(str, "name");
        if (!ckf.b(str, "AudioContext") || !AbilityOrangeConfig.INSTANCE.b("audio_context_use_new_impl", "false")) {
            return null;
        }
        iih.INSTANCE.a("AudioContextV2", "use new impl");
        i11.a aVar = i11.Companion;
        return new hun("com.alibaba.ability.impl.audio.AudioAbilityV2", 3, a.j(jpu.a("prepare", aVar.a()), jpu.a("play", aVar.a()), jpu.a("pause", aVar.a()), jpu.a("seek", aVar.a()), jpu.a("stop", aVar.a()), jpu.a("setEventListener", aVar.a()), jpu.a("setLoop", aVar.a()), jpu.a(CommandID.setMuted, aVar.a()), jpu.a(CommandID.setVolume, aVar.a()), jpu.a("setPauseInBackground", aVar.a())), "com.taobao.android.abilityidl.ability.AudioContextAbilityWrapper");
    }
}
