module dorkbox.desktop {
    exports dorkbox.desktop;

    requires transitive dorkbox.executor;
    requires transitive dorkbox.jna;
    requires transitive dorkbox.updates;
    requires transitive dorkbox.os;

    requires static com.sun.jna;
    requires static com.sun.jna.platform;

    requires static org.slf4j;
}
