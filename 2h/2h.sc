{
  "version": "0.12.0",
  "grid": "square",
  "helices": [
    {"grid_position": [0, 0], "max_offset": 64},
    {"grid_position": [0, 1], "max_offset": 64}
  ],
  "strands": [
    {
      "color": "#007200",
      "domains": [
        {"helix": 1, "forward": true, "start": 0, "end": 16},
        {"helix": 0, "forward": false, "start": 0, "end": 16}
      ]
    },
    {
      "color": "#b8056c",
      "domains": [
        {"helix": 0, "forward": false, "start": 16, "end": 31},
        {"helix": 1, "forward": true, "start": 16, "end": 31}
      ]
    },
    {
      "color": "#0066cc",
      "is_scaffold": true,
      "domains": [
        {"helix": 1, "forward": false, "start": 0, "end": 32},
        {"helix": 0, "forward": true, "start": 0, "end": 32}
      ]
    }
  ]
}