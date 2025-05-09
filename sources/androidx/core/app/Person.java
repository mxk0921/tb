package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.x8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Person {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    public IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;
    public String mKey;
    public CharSequence mName;
    public String mUri;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api22Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api22Impl() {
        }

        public static Person fromPersistableBundle(PersistableBundle persistableBundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Person) ipChange.ipc$dispatch("f927e8a1", new Object[]{persistableBundle});
            }
            return new Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString("key")).setBot(persistableBundle.getBoolean(Person.IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(Person.IS_IMPORTANT_KEY)).build();
        }

        public static PersistableBundle toPersistableBundle(Person person) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PersistableBundle) ipChange.ipc$dispatch("451cbd82", new Object[]{person});
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.mName;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", person.mUri);
            persistableBundle.putString("key", person.mKey);
            persistableBundle.putBoolean(Person.IS_BOT_KEY, person.mIsBot);
            persistableBundle.putBoolean(Person.IS_IMPORTANT_KEY, person.mIsImportant);
            return persistableBundle;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static Person fromAndroidPerson(android.app.Person person) {
            IconCompat iconCompat;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Person) ipChange.ipc$dispatch("6e1b462b", new Object[]{person});
            }
            Builder name = new Builder().setName(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.createFromIcon(person.getIcon());
            } else {
                iconCompat = null;
            }
            return name.setIcon(iconCompat).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        public static android.app.Person toAndroidPerson(Person person) {
            Icon icon;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.app.Person) ipChange.ipc$dispatch("abc45190", new Object[]{person});
            }
            Person.Builder name = new Person.Builder().setName(person.getName());
            if (person.getIcon() != null) {
                icon = person.getIcon().toIcon();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IconCompat mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;
        public String mKey;
        public CharSequence mName;
        public String mUri;

        public Builder() {
        }

        public Person build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Person) ipChange.ipc$dispatch("65e926e3", new Object[]{this});
            }
            return new Person(this);
        }

        public Builder setBot(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f87198f9", new Object[]{this, new Boolean(z)});
            }
            this.mIsBot = z;
            return this;
        }

        public Builder setIcon(IconCompat iconCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5635ff02", new Object[]{this, iconCompat});
            }
            this.mIcon = iconCompat;
            return this;
        }

        public Builder setImportant(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("efbbe094", new Object[]{this, new Boolean(z)});
            }
            this.mIsImportant = z;
            return this;
        }

        public Builder setKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f7610c93", new Object[]{this, str});
            }
            this.mKey = str;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("23a80289", new Object[]{this, charSequence});
            }
            this.mName = charSequence;
            return this;
        }

        public Builder setUri(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4dc33ae6", new Object[]{this, str});
            }
            this.mUri = str;
            return this;
        }

        public Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }
    }

    public Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public static Person fromAndroidPerson(android.app.Person person) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Person) ipChange.ipc$dispatch("6e1b462b", new Object[]{person});
        }
        return Api28Impl.fromAndroidPerson(person);
    }

    public static Person fromBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Person) ipChange.ipc$dispatch("6110a9b7", new Object[]{bundle});
        }
        Bundle bundle2 = bundle.getBundle("icon");
        return new Builder().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString("uri")).setKey(bundle.getString("key")).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public static Person fromPersistableBundle(PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Person) ipChange.ipc$dispatch("f927e8a1", new Object[]{persistableBundle});
        }
        return Api22Impl.fromPersistableBundle(persistableBundle);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String key = getKey();
        String key2 = person.getKey();
        if (key != null || key2 != null) {
            return Objects.equals(key, key2);
        }
        if (!Objects.equals(Objects.toString(getName()), Objects.toString(person.getName())) || !Objects.equals(getUri(), person.getUri()) || !Boolean.valueOf(isBot()).equals(Boolean.valueOf(person.isBot())) || !Boolean.valueOf(isImportant()).equals(Boolean.valueOf(person.isImportant()))) {
            return false;
        }
        return true;
    }

    public IconCompat getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconCompat) ipChange.ipc$dispatch("3d431b3d", new Object[]{this});
        }
        return this.mIcon;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.mKey;
    }

    public CharSequence getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("c519bfb2", new Object[]{this});
        }
        return this.mName;
    }

    public String getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4afdd683", new Object[]{this});
        }
        return this.mUri;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String key = getKey();
        if (key != null) {
            return key.hashCode();
        }
        return Objects.hash(getName(), getUri(), Boolean.valueOf(isBot()), Boolean.valueOf(isImportant()));
    }

    public boolean isBot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1760e48", new Object[]{this})).booleanValue();
        }
        return this.mIsBot;
    }

    public boolean isImportant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("917222a3", new Object[]{this})).booleanValue();
        }
        return this.mIsImportant;
    }

    public String resolveToLegacyUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("301f95d", new Object[]{this});
        }
        String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName == null) {
            return "";
        }
        return "name:" + ((Object) this.mName);
    }

    public android.app.Person toAndroidPerson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return x8k.a(ipChange.ipc$dispatch("2323f432", new Object[]{this}));
        }
        return Api28Impl.toAndroidPerson(this);
    }

    public Builder toBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("ea4657fa", new Object[]{this});
        }
        return new Builder(this);
    }

    public Bundle toBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("39245ca8", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.mName);
        IconCompat iconCompat = this.mIcon;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.mUri);
        bundle.putString("key", this.mKey);
        bundle.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle;
    }

    public PersistableBundle toPersistableBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PersistableBundle) ipChange.ipc$dispatch("7a543ea4", new Object[]{this});
        }
        return Api22Impl.toPersistableBundle(this);
    }
}
