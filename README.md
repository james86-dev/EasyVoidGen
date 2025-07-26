# Simple VoidGen for Minecraft
How to use:

Step 1.
Download Latest Release

Step 2.
Drag and drop the Plugin inside your Plugins folder

Step 3.
Delete your existing worlds

Step 4.
Go to bukkit.yml and add the following code:

worlds:<br>
  world:<br>
    generator: EasyVoidGen<br>
  world_nether:<br>
    generator: EasyVoidGen<br>
  world_the_end:<br>
    generator: EasyVoidGen<br>
<br>
Example:<br>
settings:<br>
  allow-end: true<br>
  warn-on-overload: true<br>
  permissions-file: permissions.yml<br>
  update-folder: update<br>
  plugin-profiling: false<br>
  connection-throttle: 4000<br>
  query-plugins: true<br>
  deprecated-verbose: default<br>
  shutdown-message: Server closed<br>
  minimum-api: none<br>
  use-map-color-cache: true<br>
spawn-limits:<br>
  monsters: 70<br>
  animals: 10<br>
  water-animals: 5<br>
  water-ambient: 20<br>
  water-underground-creature: 5<br>
  axolotls: 5<br>
  ambient: 15<br>
chunk-gc:<br>
  period-in-ticks: 600<br>
ticks-per:<br>
  animal-spawns: 400<br>
  monster-spawns: 1<br>
  water-spawns: 1<br>
  water-ambient-spawns: 1<br>
  water-underground-creature-spawns: 1<br>
  axolotl-spawns: 1<br>
  ambient-spawns: 1<br>
  autosave: 6000<br>
aliases: now-in-commands.yml<br>
worlds:<br>
  world:<br>
    generator: EasyVoidGen<br>
  world_nether:<br>
    generator: EasyVoidGen<br>
  world_the_end:<br>
    generator: EasyVoidGen<br>
